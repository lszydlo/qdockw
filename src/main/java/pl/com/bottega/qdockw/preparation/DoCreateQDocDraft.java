package pl.com.bottega.qdockw.preparation;

import javax.validation.constraints.NotEmpty;

public class DoCreateQDocDraft {

    @NotEmpty
    String type;
    @NotEmpty
    String title;
}
