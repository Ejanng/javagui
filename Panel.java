import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    public Panel() {
        setLayout(new BorderLayout());

        JPanel topPanel = new JPanel();
        topPanel.setLayout(new GridLayout(2, 1));

        JLabel dayLabel = new JLabel("Date today");
        dayLabel.setPreferredSize(new Dimension(300, 50));
        dayLabel.setHorizontalAlignment(SwingConstants.CENTER);
        dayLabel.setBorder(BorderFactory.createLineBorder(Color.black));

        JLabel calendarLabel = new JLabel("Calendar");
        calendarLabel.setPreferredSize(new Dimension(300, 50));
        calendarLabel.setHorizontalAlignment(SwingConstants.CENTER);
        calendarLabel.setBorder(BorderFactory.createLineBorder(Color.black));

        JPanel taskPanel = new JPanel();
                                        //Depends on how many task are there!
        taskPanel.setLayout(new GridLayout(2, 1));

        //change to for loop later!
        JPanel activityPanel = new JPanel();
        activityPanel.setLayout(new GridLayout(2, 1));
        activityPanel.setBorder(BorderFactory.createLineBorder(Color.red));

        //background image should be here!
        //JLabel for now for practices
        JLabel background = new JLabel("DO Anytime");
        background.setPreferredSize(new Dimension(300, 100));
        background.setHorizontalAlignment(SwingConstants.CENTER);
        background.setBorder(BorderFactory.createLineBorder(Color.black));
        
        JLabel progressBar = new JLabel("progress");
        progressBar.setPreferredSize(new Dimension(200, 100));
        progressBar.setHorizontalAlignment(SwingConstants.CENTER);
        progressBar.setBorder(BorderFactory.createLineBorder(Color.black));

        add(topPanel, BorderLayout.NORTH);
        topPanel.add(dayLabel);
        topPanel.add(calendarLabel);

        add(taskPanel, BorderLayout.CENTER);
        taskPanel.add(activityPanel);
        activityPanel.add(background);
        activityPanel.add(progressBar);





    }
}
