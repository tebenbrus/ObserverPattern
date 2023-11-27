public class NewsSubscriptionService {
    public static void main(String[] args) {

        NewsAgency newsAgency = new NewsAgency();

        Subscriber subscriber1 = new Subscriber("User_Steven");
        Subscriber subscriber2 = new Subscriber("User_Bruce");

        newsAgency.subscribe(subscriber1);
        newsAgency.subscribe(subscriber2);

        newsAgency.publishNews("Marshall County Sheriff’s Candidate Disputes Report of Own Death WAFF (Huntsville, Alabama)");

        newsAgency.unsubscribe(subscriber1);

        newsAgency.publishNews("FEDERAL AGENTS RAID GUN SHOP, FIND WEAPONS!");
    }
}