package mapper.devs;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/devs")
public class DevsMappingController {

    private final DevsMappingService mappingService;

    public DevsMappingController(DevsMappingService mappingService) {
        this.mappingService = mappingService;
    }

    @PostMapping("/map")
    public ResponseEntity<DevsMappingResponse> map(
            @RequestBody DevsMappingRequest request) {

        if (request == null
                || request.source() == null
                || request.source().isBlank()) {

            return ResponseEntity.badRequest().body(
                    new DevsMappingResponse(
                            false,
                            MappingStage.PARSING,
                            "La especificación DEVS está vacía.",
                            null,
                            null,
                            null,
                            null
                    )
            );
        }

        DevsMappingResponse response = mappingService.map(request.source());

        if (response.success()) {
            return ResponseEntity.ok(response);
        }

        HttpStatus status = switch (response.stage()) {
            case PARSING -> HttpStatus.BAD_REQUEST;
            case INTERMEDIATE_VALIDATION,
                 COMPUTATIONAL_VALIDATION -> HttpStatus.UNPROCESSABLE_ENTITY;
            case INTERMEDIATE_MAPPING,
                 ATL_TRANSFORMATION,
                 ERROR -> HttpStatus.INTERNAL_SERVER_ERROR;
            case COMPLETED -> HttpStatus.OK;
        };

        return ResponseEntity.status(status).body(response);
    }
}
