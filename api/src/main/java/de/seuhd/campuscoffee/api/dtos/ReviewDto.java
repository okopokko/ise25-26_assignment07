package de.seuhd.campuscoffee.api.dtos;

import lombok.Builder;
import org.jspecify.annotations.Nullable;
import org.jspecify.annotations.NonNull;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.NotBlank;
import java.time.LocalDateTime;

/**
 * DTO record for POS metadata.
 */
@Builder(toBuilder = true)
public record ReviewDto (
    @Nullable Long id,
    // TODO: Implement ReviewDto
    @Nullable LocalDateTime createdAt,
    @Nullable LocalDateTime updatedAt,

    @NonNull Long posId,

    @NonNull Long authorId,

    @NotBlank(message = "Review description cannot be empty.")
    @NonNull String review,

    @NonNull Boolean approved
) implements Dto<Long> {
    @Override
    public @Nullable Long getId() {
        return id;
    }
}
