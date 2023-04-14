package de.haevn.jfx.html;

import de.haevn.network.NetworkInteraction;
import javafx.event.ActionEvent;
import javafx.scene.control.Hyperlink;

public class AH2 extends Hyperlink {
    private String link;

    public AH2() {
        this("", "");
    }

    public AH2(String text, String link) {
        getStyleClass().add("html-ah2");
        setText(text);
        setLink(link);
        setStyle("-fx-font-size: 20;-fx-font-weight: bolder");
        setOnAction(this::openLink);
    }

    public void setLink(String link) {
        this.link = link;
    }

    private void openLink(ActionEvent event) {
        if (!link.isEmpty()) {
            NetworkInteraction.openWebsite(link);
        }
    }

}
