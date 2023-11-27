import java.util.ArrayList;
import java.util.List;

class NewsAgency {
    private List<Observer> subscribers = new ArrayList<>();

    public void subscribe(Observer subscriber) {
        subscribers.add(subscriber);
    }
    public void unsubscribe(Observer subscriber) {
        subscribers.remove(subscriber);
    }

    public void publishNews(String news) {
        System.out.println("\nBreaking News: " + news+ "\n");
        notifySubscribers(news);
    }
    private void notifySubscribers(String news) {
        for (Observer subscriber : subscribers) {
            subscriber.update(news);
        }
    }
}