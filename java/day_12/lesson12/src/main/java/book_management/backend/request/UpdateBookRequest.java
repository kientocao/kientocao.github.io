package book_management.backend.request;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UpdateBookRequest {
    private String title;
    private String author;
}
