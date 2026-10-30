package mapper.devs;

public record DevsMappingResponse(
        boolean success,
        MappingStage stage,
        String message,
        ValidationResultDto intermediateValidation,
        ValidationResultDto computationalValidation,
        String devsModelXmi,
        String devsComputationalModelXmi) {
}
