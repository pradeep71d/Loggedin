package com.example.logedin;

public class Response {
        private String user_email;

        private String social_id;

        private String user_id;

        private String api_token;

        private String image_id;

        public String getUser_email ()
        {
            return user_email;
        }

        public void setUser_email (String user_email)
        {
            this.user_email = user_email;
        }

        public String getSocial_id ()
        {
            return social_id;
        }

        public void setSocial_id (String social_id)
        {
            this.social_id = social_id;
        }

        public String getUser_id ()
        {
            return user_id;
        }

        public void setUser_id (String user_id)
        {
            this.user_id = user_id;
        }

        public String getApi_token ()
        {
            return api_token;
        }

        public void setApi_token (String api_token)
        {
            this.api_token = api_token;
        }

        public String getImage_id ()
        {
            return image_id;
        }

        public void setImage_id (String image_id)
        {
            this.image_id = image_id;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [user_email = "+user_email+", social_id = "+social_id+", user_id = "+user_id+", api_token = "+api_token+", image_id = "+image_id+"]";
        }
    }



