package ac.za.cput.projects;

public class Disabling {

        private String message;

        public Disabling(String message) {

            this.message = message;

        }


        public String printingMessage() {

            return message;
        }


        public String displayMessage() {
            message = "Phillip" + message;
            return message;
        }

        public String implement()
        {
            return "this is not yet implemented";
        }

}
