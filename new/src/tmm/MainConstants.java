package tmm;

public class MainConstants
{
  public static String TOPIC_DETECTION_METHOD = "TOPIC_DETECTION_METHOD";
  public static String TWEETS_DIRECTORY = "TWEETS_DIRECTORY";
  public static String TWEETS_FILE = "TWEETS_FILE";
  public static String TEXT_BASED_DYSCO_CREATION_METHOD = "TEXT_BASED_DYSCO_CREATION_METHOD";
  public static String TERM_SIMILARITY_METHOD = "TERM_SIMILARITY_METHOD";
  public static String SHOW_TOPICS_ON_STD = "SHOW_TOPICS_ON_STD";
  public static String N_TOPICS_TO_SAVE = "N_TOPICS_TO_SAVE";
  public static String SAVE_TOPICS_ON_FILE = "SAVE_TOPICS_ON_FILE";
  public static String RESULTS_FILE = "RESULTS_FILE";
  public static String RESULTS_DIRECTORY = "RESULTS_DIRECTORY";
  
  public static enum TOPIC_DETECTIONS_METHODS
  {
    BNGRAM,  LDA,  DOC_PIVOT,  GRAPH_BASED,  SOFT_FIM;
    
    private TOPIC_DETECTIONS_METHODS() {}
  }
  
  public static enum TERM_SIMILARITY_METHODS
  {
    NO_OF_COOCCURRENCES,  NO_OF_COOCCURRENCES_REGULARIZED_MIN,  NO_OF_COOCCURRENCES_REGULARIZED_MAX,  NO_OF_COOCCURRENCES_REGULARIZED_SUM,  NO_OF_COOCCURRENCES_REGULARIZED_TIMES,  JACCARD,  COSINE;
    
    private TERM_SIMILARITY_METHODS() {}
  }
}