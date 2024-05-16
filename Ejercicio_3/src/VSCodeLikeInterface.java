import javax.swing.*;
import java.awt.*;

public class VSCodeLikeInterface {
    public static void main(String[] args) {

        JFrame frame = new JFrame("VS Code Like Interface");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(new BorderLayout());

        Color backgroundColor = new Color(30, 30, 30); 
        Color sideBarColor = new Color(37, 37, 38); 
        Color topBarColor = new Color(45, 45, 45); 
        Color statusBarColor = new Color(45, 45, 45); 
        Color textColor = Color.WHITE; 
        Color buttonBackgroundColor = new Color(45, 45, 45); 

        JPanel topBar = new JPanel();
        topBar.setBackground(topBarColor);
        topBar.setPreferredSize(new Dimension(frame.getWidth(), 30));
        topBar.setLayout(new FlowLayout(FlowLayout.LEFT));

        JButton newFileButton = createStyledButton("New File", textColor, buttonBackgroundColor);
        topBar.add(newFileButton);

        JButton openFileButton = createStyledButton("Open File", textColor, buttonBackgroundColor);
        topBar.add(openFileButton);

        JButton runButton = createStyledButton("Run", textColor, buttonBackgroundColor);
        topBar.add(runButton);

        frame.add(topBar, BorderLayout.NORTH);

        JPanel sideBar = new JPanel();
        sideBar.setBackground(sideBarColor);
        sideBar.setPreferredSize(new Dimension(60, frame.getHeight()));
        sideBar.setLayout(new GridLayout(5, 1, 0, 5));

        sideBar.add(createStyledIconButton("icons/explorer.png", "Explorer", sideBarColor, 30, 30));
        sideBar.add(createStyledIconButton("icons/search.png", "Search", sideBarColor, 30, 30));
        sideBar.add(createStyledIconButton("icons/git.png", "Source Control", sideBarColor, 30, 30));

        frame.add(sideBar, BorderLayout.WEST);

        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(backgroundColor);
        mainPanel.setLayout(new BorderLayout());

        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.setBackground(backgroundColor);
        tabbedPane.setForeground(textColor);
        tabbedPane.addTab("Archivo1.txt", new JScrollPane(createStyledTextArea()));
        tabbedPane.addTab("Archivo2.txt", new JScrollPane(createStyledTextArea()));
        mainPanel.add(tabbedPane, BorderLayout.CENTER);

        frame.add(mainPanel, BorderLayout.CENTER);

        JPanel statusBar = new JPanel();
        statusBar.setBackground(statusBarColor);
        statusBar.setPreferredSize(new Dimension(frame.getWidth(), 20));
        statusBar.setLayout(new BorderLayout());

        JLabel statusLabel = new JLabel("Ready");
        statusLabel.setForeground(textColor);
        statusBar.add(statusLabel, BorderLayout.WEST);

        frame.add(statusBar, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    private static JButton createStyledButton(String text, Color textColor, Color backgroundColor) {
        JButton button = new JButton(text);
        button.setForeground(textColor);
        button.setBackground(backgroundColor);
        button.setBorderPainted(false);
        return button;
    }

    private static JButton createStyledIconButton(String iconPath, String toolTipText, Color backgroundColor, int width, int height) {
        ImageIcon originalIcon = new ImageIcon(iconPath);
        Image scaledImage = originalIcon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);

        JButton button = new JButton(scaledIcon);
        button.setToolTipText(toolTipText);
        button.setBackground(backgroundColor);
        button.setBorderPainted(false);
        return button;
    }

    private static JTextArea createStyledTextArea() {
        JTextArea textArea = new JTextArea();
        textArea.setBackground(new Color(40, 44, 52));
        textArea.setForeground(Color.WHITE);
        textArea.setCaretColor(Color.WHITE);
        textArea.setFont(new Font("Consolas", Font.PLAIN, 14));
        return textArea;
    }
}

