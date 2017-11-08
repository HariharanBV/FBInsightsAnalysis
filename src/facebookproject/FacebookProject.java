/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facebookproject;

import com.csvreader.*;
import static facebookproject.CSVReadWrite.CSVContentStore;
import static facebookproject.CSVReadWrite.CSVHeaderInitialize;
import static facebookproject.JSONParse.*;
import static facebookproject.UrlParsing.AssignInsightsURL;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author admin
 */
public class FacebookProject {
    private static String readUrl(String urlString) throws Exception {
        BufferedReader reader = null;
        try {
            URL url = new URL(urlString);
            reader = new BufferedReader(new InputStreamReader(url.openStream()));
            StringBuilder buffer = new StringBuilder();
            int read;
            char[] chars = new char[1024];
            while ((read = reader.read(chars)) != -1) {
                buffer.append(chars, 0, read);
            }
            return buffer.toString();
        } finally {
            if (reader != null) {
                reader.close();
            }
        }

    }  
    public static JSONArray returnFinalJSONArray(String pageid,String Metrics,String SinceDate,String UntilDate) throws Exception 
    {
         String url=AssignInsightsURL(pageid,"insights",Metrics,"day",SinceDate,UntilDate);
         String json=readUrl(url);
          JSONParser parser=new JSONParser();
        JSONObject jo=(JSONObject) parser.parse(json);
        JSONArray ja=(JSONArray)jo.get("data");
        JSONObject jo1=(JSONObject)ja.get(0);
        JSONArray ja1=(JSONArray)jo1.get("values");
        return ja1;
    }
    public static void main(String[] args) throws Exception {
        try
        {
        String pageid="234829869868182"; 
        String SinceDate="2017-10-09";
        String UntilDate="2017-11-07";
        JSONArray ja1=returnFinalJSONArray(pageid,"page_impressions_unique",SinceDate,UntilDate);
        List<String> Date=new ArrayList();
        Date=JsonArraytoList(ja1,"end_time");
        List<String> DailyTotalReach=JsonArray_inttoList(ja1,"value");      
        ja1=returnFinalJSONArray(pageid,"page_fan_removes",SinceDate,UntilDate);
        List<String> DailyUnlikes=JsonArray_inttoList(ja1,"value");
        ja1=returnFinalJSONArray(pageid,"page_consumptions_by_consumption_type",SinceDate,UntilDate);
        List<String> PhotoViews=JsonArray_inttoList(ja1,"value","photo view");
        List<String> OtherClicks=JsonArray_inttoList(ja1,"value","other clicks");
        List<String> VideoPlay=JsonArray_inttoList(ja1,"value","video play");
        List<String> LinkClicks=JsonArray_inttoList(ja1,"value","link clicks");      
        ja1=returnFinalJSONArray(pageid,"page_engaged_users",SinceDate,UntilDate);
        List<String> PageEngagedUser=JsonArray_inttoList(ja1,"value");
        ja1=returnFinalJSONArray(pageid,"page_consumptions_unique",SinceDate,UntilDate);
        List<String> PageConsumers=JsonArray_inttoList(ja1,"value");
         ja1=returnFinalJSONArray(pageid,"page_consumptions",SinceDate,UntilDate);
        List<String> PageConsumptions=JsonArray_inttoList(ja1,"value");
        ja1=returnFinalJSONArray(pageid,"page_impressions_organic_unique",SinceDate,UntilDate);
        List<String> OrganicReach=JsonArray_inttoList(ja1,"value");
        ja1=returnFinalJSONArray(pageid,"page_impressions_paid_unique",SinceDate,UntilDate);
        List<String> PaidReach=JsonArray_inttoList(ja1,"value");
         ja1=returnFinalJSONArray(pageid,"page_impressions",SinceDate,UntilDate);
        List<String> TotalImpressions=JsonArray_inttoList(ja1,"value");
         ja1=returnFinalJSONArray(pageid,"page_impressions_organic",SinceDate,UntilDate);
        List<String> OrganicImpressions=JsonArray_inttoList(ja1,"value");
         ja1=returnFinalJSONArray(pageid,"page_impressions_paid",SinceDate,UntilDate);
        List<String> PaidImpressions=JsonArray_inttoList(ja1,"value");
        ja1=returnFinalJSONArray(pageid,"page_impressions_viral",SinceDate,UntilDate);
        List<String> ViralImpressions=JsonArray_inttoList(ja1,"value");
         ja1=returnFinalJSONArray(pageid,"page_post_engagements",SinceDate,UntilDate);
        List<String> PageEngagements=JsonArray_inttoList(ja1,"value");
         ja1=returnFinalJSONArray(pageid,"page_fan_adds",SinceDate,UntilDate);
        List<String> DailyNewLikes=JsonArray_inttoList(ja1,"value");
         ja1=returnFinalJSONArray(pageid,"page_negative_feedback_unique",SinceDate,UntilDate);
        List<String> DailyNegativeFeedbackUnique=JsonArray_inttoList(ja1,"value");   
        ja1=returnFinalJSONArray(pageid,"page_fans_online_per_day",SinceDate,UntilDate);     
        String[] FansOnline=JsonArray_int_Count1Less_toList(ja1,"value");
        FansOnline[ja1.size()-1]="0";  
        ja1=returnFinalJSONArray(pageid,"page_actions_post_reactions_like_total",SinceDate,UntilDate);
         List<String> TotalLikeReactions=JsonArray_inttoList(ja1,"value");
          ja1=returnFinalJSONArray(pageid,"page_actions_post_reactions_love_total",SinceDate,UntilDate);
         List<String> TotalLoveReactions=JsonArray_inttoList(ja1,"value");   
          ja1=returnFinalJSONArray(pageid,"page_actions_post_reactions_wow_total",SinceDate,UntilDate);
         List<String> TotalWowReactions=JsonArray_inttoList(ja1,"value");   
          ja1=returnFinalJSONArray(pageid,"page_actions_post_reactions_haha_total",SinceDate,UntilDate);
         List<String> TotalHaHaReactions=JsonArray_inttoList(ja1,"value");   
          ja1=returnFinalJSONArray(pageid,"page_actions_post_reactions_sorry_total",SinceDate,UntilDate);
        List<String> TotalSorryReactions=JsonArray_inttoList(ja1,"value");     
         ja1=returnFinalJSONArray(pageid,"page_actions_post_reactions_anger_total",SinceDate,UntilDate);
         List<String> TotalAngerReactions=JsonArray_inttoList(ja1,"value"); 
        ja1=returnFinalJSONArray(pageid,"page_views_total",SinceDate,UntilDate);
         List<String> PageViews=JsonArray_inttoList(ja1,"value"); 
        ja1=returnFinalJSONArray(pageid,"page_video_views_autoplayed",SinceDate,UntilDate);
         List<String> VideosAutoPlayed=JsonArray_inttoList(ja1,"value"); 
          ja1=returnFinalJSONArray(pageid,"page_video_views_click_to_play",SinceDate,UntilDate);
         List<String> VideosClicktoPlay=JsonArray_inttoList(ja1,"value"); 
         ja1=returnFinalJSONArray(pageid,"page_video_complete_views_30s_organic",SinceDate,UntilDate);
         List<String> VideosClick30sPlay=JsonArray_inttoList(ja1,"value"); 
          ja1=returnFinalJSONArray(pageid,"page_video_views_10s_organic",SinceDate,UntilDate);
         List<String> VideosClick10sPlay=JsonArray_inttoList(ja1,"value"); 
         System.out.println("Insights Ready!!Writing CSV File");
         CsvWriter csvInsights = new CsvWriter(new FileWriter("posts52.csv", true), ',');
         csvInsights=CSVHeaderInitialize(csvInsights);
         System.out.println("CSV Header Finished");
         csvInsights=CSVContentStore(ja1.size(),csvInsights,Date,DailyTotalReach,DailyUnlikes,PhotoViews,OtherClicks,VideoPlay,LinkClicks,PageEngagedUser,PageConsumers,PageConsumptions,OrganicReach,PaidReach,TotalImpressions,OrganicImpressions,PaidImpressions,ViralImpressions,PageEngagements,DailyNewLikes,DailyNegativeFeedbackUnique,FansOnline,TotalLikeReactions,TotalLoveReactions,TotalWowReactions,TotalHaHaReactions,TotalSorryReactions,TotalAngerReactions,PageViews,VideosAutoPlayed,VideosClicktoPlay,VideosClick30sPlay,VideosClick10sPlay);
         csvInsights.close();
         System.out.println("Datas Ready to Analyze");
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
    
}
