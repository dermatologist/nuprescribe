package ca.nuchange.nuprescribe.view;

import java.util.ResourceBundle;

public enum FxmlView {
    APP {
        @Override
        public String getTitle() {
            return getStringFromResourceBundle("app.title");
        }

        @Override
        public String getFxmlFile() {
            return "/fxml/App.fxml";
        }
    },
    USER {
        @Override
        public String getTitle() {
            return getStringFromResourceBundle("user.title");
        }

        @Override
        public String getFxmlFile() {
            return "/fxml/User.fxml";
        }
    },
    LOGIN {
        @Override
        public String getTitle() {
            return getStringFromResourceBundle("login.title");
        }

        @Override
        public String getFxmlFile() {
            return "/fxml/Login.fxml";
        }
    };

    public abstract String getTitle();

    public abstract String getFxmlFile();

    String getStringFromResourceBundle(String key) {
        return ResourceBundle.getBundle("Bundle").getString(key);
    }

}