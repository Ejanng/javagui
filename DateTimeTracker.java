import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeTracker extends JFrame {

    private JLabel dateTimeLabel;

    public DateTimeTracker() {
        setTitle("Date and Time Tracker");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        initializeComponents();
    }

    private void initializeComponents() {
        Container container = getContentPane();
        container.setLayout(new BorderLayout());

        dateTimeLabel = new JLabel();
        dateTimeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(dateTimeLabel, BorderLayout.CENTER);

        // Update date and time every second
        Timer timer = new Timer(1000, e -> updateDateTime());
        timer.start();
    }

    private void updateDateTime() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDate = dateFormat.format(new Date());
        dateTimeLabel.setText(formattedDate);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            DateTimeTracker dateTimeTracker = new DateTimeTracker();
            dateTimeTracker.setVisible(true);
        });
    }
}

