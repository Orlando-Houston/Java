package Enum;

public class WebSites {
    public enum Web{
        GOOGLE("www.google.com"),
        YAHOO("www.yahoo.com"),
        FACEBOOK("www.facebook.com");

        private String site;

        Web(String site){
            this.site=site;
        }
        public String getSite(){
            return this.site;
        }
    }

    public static void main(String[] args) {
        for(Web ws : Web.values()){
            System.out.println(ws + "="+ ws.getSite());
        }
    }
}
