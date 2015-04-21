import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
public class Consumer{
	public void Start(){
		crawl();
	}

	public void crawl(){
		String crawlUrl = this.getCrawlUrl();

		HashSet<String> anchors = new HashSet();
		try{
			Document doc = Jsoup.connect(crawlUrl).get();
			Elements newsHeadlines = doc.select("#mp-itn b a");
			for(Element newsHeadline : newsHeadlines){
				String anchor = newsHeadline.attr("href").trim();
				anchors.add(anchor);
				System.out.println(anchor);
			}
		}catch(IOException ex){
			Logger.getLogger(WebCrawler.class.getName()).log(Level.SEVERE, null, ex);
		}
		System.out.println("---------------");

		for(String s: anchors){
			System.out.println(s);
		}
	}

	private void getCrawlUrl(){
		String url = "http://en.wikipedia.org/";
		return url;
	}
}
