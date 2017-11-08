/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facebookproject;

/**
 *
 * @author admin
 */
public class UrlParsing {
    
    public static String  AssignInsightsURL(String PageID,String Category,String Metrics,String Period,String Since,String Until)
    {
        String url1="https://graph.facebook.com/v2.10";
        String AccessToken="EAARLjW5DuxgBANfwgZBMM5ZBW6b7MESPpZALZBZCnG3733ZC6gEFomxBrPZBevGc8qMg3kKlTeFQfn17zhuF6TfbP5EG5mRXPryfJ9HGkNeh0xzXMdOjx6i7cFu28VOwyX9zlpgBMcEZAWuZBVcFrVGpZAv9VVfOnpZBoj0A4A1BBXTpwZDZD";
        String url=url1+"/"+PageID+"/"+Category+"/"+Metrics+"/"+Period+"?"+"since="+Since+"&until="+Until+"&access_token="+AccessToken;
        return url;
    }
    
}
