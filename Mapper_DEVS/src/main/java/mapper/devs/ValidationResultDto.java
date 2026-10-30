package mapper.devs;

import java.util.List;

public record ValidationResultDto(
        boolean valid,
        int severity,
        List<String> diagnostics) {
}
