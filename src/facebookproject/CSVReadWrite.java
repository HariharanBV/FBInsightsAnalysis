/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facebookproject;

import com.csvreader.CsvWriter;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author admin
 */
public class CSVReadWrite {
    
       public static CsvWriter CSVHeaderInitialize(CsvWriter csv1) throws IOException
       {
           csv1.write("Date");
           csv1.write("DailyTotalReach");
           csv1.write("DailyUnlikes");
           csv1.write("PhotoViews");
           csv1.write("OtherClicks");
           csv1.write("VideoPlay");
           csv1.write("LinkClicks");
           csv1.write("PageEngagedUsers");
           csv1.write("PageConsumers");
           csv1.write("PageConsumptions");
           csv1.write("OrganicReach");
           csv1.write("PaidReach");
           csv1.write("TotalImpressions");
           csv1.write("OrganicImpressions");
           csv1.write("PaidImpressions");
           csv1.write("ViralImpressions");
           csv1.write("PageEngagements");
           csv1.write("DailyNewLikes");
           csv1.write("DailyNegativeFeedback");
           csv1.write("FansOnline");
           csv1.write("TotalLikeReactions");
           csv1.write("TotalLoveReactions");
           csv1.write("TotalWowReations");
           csv1.write("TotalHaHaReactions");
           csv1.write("TotalSorryReactions");
           csv1.write("TotalAngerReactions");
           csv1.write("PageViews");
           csv1.write("VideoAutoPlayed");
           csv1.write("VideoClickstoPlay");
           csv1.write("VideoClicks30sPlay");
           csv1.write("VideoClicks10sPlay");
           csv1.endRecord();
           return csv1;
       }
       public static CsvWriter CSVContentStore(int n,CsvWriter csv,List<String> Date,List<String> DailyTotalReach,List<String> DailyUnlikes,List<String> PhotoViews,List<String> OtherClicks,List<String> VideoPlay,List<String> LinkClicks,List<String> PageEngagedUser,List<String> PageConsumers,List<String> PageConsumptions,List<String> OrganicReach,List<String> PaidReach,List<String> TotalImpressions,List<String> OrganicImpressions,List<String> PaidImpressions,List<String> ViralImpressions,List<String> PageEngagements,List<String> DailyNewLikes,List<String> DailyNegativeFeedbackUnique,String[] FansOnline,List<String> TotalLikeReactions,List<String> TotalLoveReactions,List<String> TotalWowReactions,List<String> TotalHaHaReactions,List<String> TotalSorryReactions,List<String> TotalAngerReactions,List<String> PageViews,List<String> VideosAutoPlayed,List<String> VideosClicktoPlay,List<String> VideosClick30sPlay,List<String> VideosClick10sPlay) throws IOException
       {
           for(int i=0;i<n-1;i++)
           {
               System.out.println("Loop Running");
               csv.write(Date.get(i));
               csv.write(DailyTotalReach.get(i));
               csv.write(DailyUnlikes.get(i));
               csv.write(PhotoViews.get(i));
               csv.write(OtherClicks.get(i));
               csv.write(VideoPlay.get(i));
               csv.write(LinkClicks.get(i));
               csv.write(PageEngagedUser.get(i));
               csv.write(PageConsumers.get(i));
               csv.write(PageConsumptions.get(i));
               csv.write(OrganicReach.get(i));
               csv.write(PaidReach.get(i));
               csv.write(TotalImpressions.get(i));
               csv.write(OrganicImpressions.get(i));
               csv.write(PaidImpressions.get(i));
               csv.write(ViralImpressions.get(i));
               csv.write(PageEngagements.get(i));
               csv.write(DailyNewLikes.get(i));
               csv.write(DailyNegativeFeedbackUnique.get(i));
               csv.write(FansOnline[i]);
               csv.write(TotalLikeReactions.get(i));
               csv.write(TotalLoveReactions.get(i));
               csv.write(TotalWowReactions.get(i));
               csv.write(TotalHaHaReactions.get(i));
               csv.write(TotalSorryReactions.get(i));
               csv.write(TotalAngerReactions.get(i));
               csv.write(PageViews.get(i));
               csv.write(VideosAutoPlayed.get(i));
               csv.write(VideosClicktoPlay.get(i));
               csv.write(VideosClick30sPlay.get(i));
               csv.write(VideosClick10sPlay.get(i));
               csv.endRecord();
              
           }
            csv.close();
           System.out.println("Loop Finished");
           return csv;
       }
}
