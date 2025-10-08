import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

class VotingSystem {
    public Map<String, Integer> votes = new HashMap<>();
    public Map<String, Integer> genderMap = new HashMap<>();

    VotingSystem() {
        votes.put("BJP", 0);
        votes.put("CONGRESS", 0);
        votes.put("AAP", 0);
        votes.put("NOTA", 0);

        genderMap.put("Male", 0);
        genderMap.put("Female", 0);
        genderMap.put("Others", 0);
    }

    public void start() {
        System.out.println("Voting System Started");

        JFrame frame = new JFrame("Voting System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.getContentPane().setBackground(Color.PINK);

        JPanel top = new JPanel();
        JLabel title = new JLabel("Voting System");
        title.setFont(new Font("Verdana", Font.BOLD, 48));
        title.setForeground(Color.BLACK);
        top.add(title);
        frame.add(top, BorderLayout.NORTH);

        JPanel center = new JPanel();
        center.setBackground(Color.PINK);
        center.setLayout(new BoxLayout(center, BoxLayout.Y_AXIS));

        // Age Panel
        JPanel agePanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 20, 10));
        agePanel.setBackground(Color.PINK);
        JLabel ageLabel = new JLabel("Enter your age: ");
        ageLabel.setFont(new Font("Serif", Font.PLAIN, 28));
        JTextField ageField = new JTextField(10);
        ageField.setFont(new Font("Serif", Font.PLAIN, 28));
        JButton verify = new JButton("Verify Age");
        verify.setFont(new Font("Serif", Font.PLAIN, 28));
        verify.setBackground(Color.BLUE);
        verify.setForeground(Color.WHITE);
        verify.setBorderPainted(false);
        agePanel.add(ageLabel);
        agePanel.add(ageField);
        agePanel.add(verify);

        // Gender Panel
        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 20, 10));
        genderPanel.setBackground(Color.PINK);
        JLabel genderLabel = new JLabel("Choose Gender: ");
        genderLabel.setFont(new Font("Serif", Font.PLAIN, 28));
        JRadioButton male = new JRadioButton("MALE");
        JRadioButton female = new JRadioButton("FEMALE");
        JRadioButton others = new JRadioButton("OTHERS");
        male.setBackground(Color.PINK);
        female.setBackground(Color.PINK);
        others.setBackground(Color.PINK);
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        genderGroup.add(others);
        genderPanel.add(genderLabel);
        genderPanel.add(male);
        genderPanel.add(female);
        genderPanel.add(others);

        // Candidate Panel
        JPanel candidatePanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 20, 10));
        candidatePanel.setBackground(Color.PINK);
        JLabel candidateLabel = new JLabel("Choose Candidate: ");
        candidateLabel.setFont(new Font("Serif", Font.PLAIN, 28));
        JRadioButton bjp = new JRadioButton("BJP");
        JRadioButton congress = new JRadioButton("CONGRESS");
        JRadioButton aap = new JRadioButton("AAP");
        JRadioButton nota = new JRadioButton("NOTA");
        bjp.setBackground(Color.PINK);
        congress.setBackground(Color.PINK);
        aap.setBackground(Color.PINK);
        nota.setBackground(Color.PINK);
        ButtonGroup candidateGroup = new ButtonGroup();
        candidateGroup.add(bjp);
        candidateGroup.add(congress);
        candidateGroup.add(aap);
        candidateGroup.add(nota);
        candidatePanel.add(candidateLabel);
        candidatePanel.add(bjp);
        candidatePanel.add(congress);
        candidatePanel.add(aap);
        candidatePanel.add(nota);

        JButton vote = new JButton("Vote");
        vote.setFont(new Font("Serif", Font.PLAIN, 28));
        vote.setBackground(Color.GREEN);
        vote.setForeground(Color.WHITE);
        vote.setBorderPainted(false);
        vote.setEnabled(false);
        candidatePanel.add(vote);

        center.add(agePanel);
        center.add(genderPanel);
        center.add(candidatePanel);

        // Bottom Panel
        JPanel bottom = new JPanel();
        JButton displayBtn = new JButton("View Results");
        displayBtn.setFont(new Font("Serif", Font.PLAIN, 28));
        bottom.add(displayBtn);
        frame.add(center, BorderLayout.CENTER);
        frame.add(bottom, BorderLayout.SOUTH);

        frame.setVisible(true);

        // Verify age logic
        verify.addActionListener(e -> {
            String ageText = ageField.getText();
            if (ageText.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Please enter your age.");
                return;
            }
            try {
                int age = Integer.parseInt(ageText);
                if (age < 0 || age > 120) {
                    JOptionPane.showMessageDialog(frame, "Please enter a valid age.");
                } else if (age >= 18) {
                    JOptionPane.showMessageDialog(frame, "You are eligible to vote.");
                    verify.setEnabled(false);
                    vote.setEnabled(true);
                } else {
                    JOptionPane.showMessageDialog(frame, "You are not eligible to vote.");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(frame, "Please enter a valid number for age.");
            }
        });

        // Voting logic
        vote.addActionListener(e -> {
            String selectedGender = getSelectedGender(male, female, others);
            if (selectedGender == null) {
                JOptionPane.showMessageDialog(frame, "Please select a gender.");
                return;
            }
            genderMap.put(selectedGender, genderMap.get(selectedGender) + 1);

            String selectedCandidate = getSelectedCandidate(bjp, congress, aap, nota);
            if (selectedCandidate == null) {
                JOptionPane.showMessageDialog(frame, "Please select a candidate.");
                return;
            }
            votes.put(selectedCandidate, votes.get(selectedCandidate) + 1);
            JOptionPane.showMessageDialog(frame, "Your vote for " + selectedCandidate + " has been recorded.");
            verify.setEnabled(true);
            vote.setEnabled(false);
            ageField.setText("");
            genderGroup.clearSelection();
            candidateGroup.clearSelection();
        });

        // Display results logic
        displayBtn.addActionListener(e -> {
            JTextField username = new JTextField();
            JPasswordField password = new JPasswordField();
            JPanel adminPanel = new JPanel(new GridLayout(2, 2));
            adminPanel.add(new JLabel("Username: "));
            adminPanel.add(username);
            adminPanel.add(new JLabel("Password: "));
            adminPanel.add(password);

            int option = JOptionPane.showConfirmDialog(frame, adminPanel, "Admin Login",
                    JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

            if (option == JOptionPane.OK_OPTION) {
                if (username.getText().equals("admin") && new String(password.getPassword()).equals("admin@123")) {
                    displayVoteResults();
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid credentials!");
                }
            }
        });
    }

    public String getSelectedGender(JRadioButton male, JRadioButton female, JRadioButton others) {
        if (male.isSelected()) return "Male";
        if (female.isSelected()) return "Female";
        if (others.isSelected()) return "Others";
        return null;
    }

    public String getSelectedCandidate(JRadioButton bjp, JRadioButton congress, JRadioButton aap, JRadioButton nota) {
        if (bjp.isSelected()) return "BJP";
        if (congress.isSelected()) return "CONGRESS";
        if (aap.isSelected()) return "AAP";
        if (nota.isSelected()) return "NOTA";
        return null;
    }

    public void displayVoteResults() {
        JFrame res = new JFrame("Voting Results");
        res.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        res.setSize(800, 600);

        JLabel resTitle = new JLabel("Voting Results", SwingConstants.CENTER);
        resTitle.setFont(new Font("Verdana", Font.BOLD, 40));
        res.add(resTitle, BorderLayout.NORTH);

        JPanel resCenter = new JPanel();
        resCenter.setLayout(new GridLayout(0, 1, 10, 5));

        resCenter.add(new JLabel("GENDER DEMOGRAPHICS"));
        resCenter.add(new JLabel("Male : " + genderMap.get("Male")));
        resCenter.add(new JLabel("Female : " + genderMap.get("Female")));
        resCenter.add(new JLabel("Others : " + genderMap.get("Others")));

        resCenter.add(new JLabel("VOTE POLLS"));
        resCenter.add(new JLabel("BJP : " + votes.get("BJP")));
        resCenter.add(new JLabel("CONGRESS : " + votes.get("CONGRESS")));
        resCenter.add(new JLabel("AAP : " + votes.get("AAP")));
        resCenter.add(new JLabel("NOTA : " + votes.get("NOTA")));

        res.add(resCenter, BorderLayout.CENTER);
        res.setVisible(true);
    }

   
}
