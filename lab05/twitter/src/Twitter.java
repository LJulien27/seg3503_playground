public class Twitter {

  public String loadTweet() {
    try {
      Thread.sleep(4000);
    } catch (InterruptedException e) {
    }

    double r = Math.random();
    if (r <= 0.45) {
      return "I am tweet that likes to talk about @me";
    } else if (r <= 0.9) {
      return "Hello to @you";
    } else {
      return null;
    }
  }

  public boolean isMentionned(String name) {
    String tweet = loadTweet();

    if (tweet == null) {
      return false;
    }

    String x = "";
    int nouveau = tweet.indexOf("@");

    int empty = nouveau;
    while (empty < tweet.length()) {
      if (tweet.charAt(empty) == ' ') {
        break;
      }
      x = x + tweet.charAt(empty);
      empty++;
    }
    return x.equals("@" + name);
  }

}