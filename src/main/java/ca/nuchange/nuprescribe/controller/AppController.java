package ca.nuchange.nuprescribe.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

@Controller
public class AppController implements Initializable {

    @Value("${\"git.closest.tag.name\"}")
    private String tag;

    @Value("${\"git.branch\"}")
    private String branch;

    @Value("${\"git.commit.id.abbrev\"}")
    private String commitId;

    @Value("${\"git.build.time\"}")
    private String buildTime;

    @FXML
    private Button btnFolder;

    @FXML
    private Label lblFolder;

    @FXML
    private Label lblVersion;

    @FXML
    private void btnFolderAction(ActionEvent event) {
        var chooser = new DirectoryChooser();
        chooser.setTitle("Choose Image Folder");
        //File defaultDirectory = new File("");
        //chooser.setInitialDirectory(defaultDirectory);
        File selectedDirectory = chooser.showDialog(new Stage());
        lblFolder.setText(selectedDirectory.getPath());
        //System.out.println(selectedDirectory.getPath());
    }

    @FXML
    private void btnExitAction(ActionEvent event) {
        // TODO add your handling code here:
        System.exit(0);
    }

    @FXML
    private void btnClearAction(ActionEvent event) {
        // TODO add your handling code here:
        System.exit(0);
    }

    @FXML
    private void btnSearchAction(ActionEvent event) {
        // TODO add your handling code here:
        System.exit(0);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        lblVersion.setText("Build: " + branch + tag + commitId + buildTime);
    }

}