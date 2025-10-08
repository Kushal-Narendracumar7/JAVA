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

        JPanel agePanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 20, 10));
        agePanel.setBackground(Color.PINK);
        JLabel ageLabel = new JLabel("Enter your age: ");
        ageLabel.setFont(new Font("Serif", Font.PLAIN, 28));
        ageLabel.setForeground(Color.BLACK);
        JTextField ageField = new JTextField(10);
        ageField.setFont(new Font("Serif", Font.PLAIN, 28));
        JButton verify = new JButton("Verify Age");
        verify.setFont(new Font("Serif", Font.PLAIN, 28));

        verify.setBackground(Color.blue);
        verify.setForeground(Color.WHITE);
        verify.setBorderPainted(false);

        agePanel.add(ageLabel);
        agePanel.add(ageField);
        agePanel.add(verify);

        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 20, 10));
        genderPanel.setBackground(Color.PINK);
        JLabel genderLabel = new JLabel("Choose Gender: ");
        genderLabel.setFont(new Font("Serif", Font.PLAIN, 28));
        genderLabel.setForeground(Color.BLACK);
        JRadioButton male = new JRadioButton("MALE");
        JRadioButton female = new JRadioButton("FEMALE");
        JRadioButton others = new JRadioButton("OTHERS");
        ButtonGroup genderGroup = new ButtonGroup();
        male.setBackground(Color.PINK);
        female.setBackground(Color.PINK);
        others.setBackground(Color.PINK);

        genderGroup.add(male);
        genderGroup.add(female);
        genderGroup.add(others);
        genderPanel.add(genderLabel);
        genderPanel.add(male);
        genderPanel.add(female);
        genderPanel.add(others);

        // Gender Panel
        JPanel candidatePanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 20, 10));
        candidatePanel.setBackground(Color.PINK);
        JLabel candidateLabel = new JLabel("Choose Candidate: ");
        candidateLabel.setFont(new Font("Serif", Font.PLAIN, 28));
        candidateLabel.setForeground(Color.BLACK);
        JRadioButton bjp = new JRadioButton("BJP");
        JRadioButton congress = new JRadioButton("CONGRESS");
        JRadioButton aap = new JRadioButton("AAP");
        JRadioButton nota = new JRadioButton("NOTA");
        ButtonGroup candidateGroup = new ButtonGroup();

        bjp.setBackground(Color.PINK);
        congress.setBackground(Color.PINK);
        aap.setBackground(Color.PINK);
        nota.setBackground(Color.PINK);

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
        vote.setBackground(Color.green);
        vote.setForeground(Color.WHITE);
        vote.setBorderPainted(false);
        vote.setEnabled(false);
        candidatePanel.add(vote);

        center.add(agePanel);
        center.add(genderPanel);
        center.add(candidatePanel);

        JPanel bottom = new JPanel();
        JButton displayBtn = new JButton("View Results");
        displayBtn.setFont(new Font("Serif", Font.PLAIN, 28));
        bottom.add(displayBtn, BorderLayout.CENTER);

        frame.add(center, BorderLayout.CENTER);
        frame.add(bottom, BorderLayout.SOUTH);

        frame.setVisible(true);

        verify.addActionListener(e -> {
            String ageText = ageField.getText();
            if (ageText.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Please enter your age.");
                return;
            } else {

                try {
                    int age = Integer.parseInt(ageText);
                    if (age < 0 || age > 120) {
                        JOptionPane.showMessageDialog(frame, "Please enter a valid age.");
                        return;
                    } else if (age >= 18) {
                        JOptionPane.showMessageDialog(frame, "You are  eligible to vote.");
                        verify.setEnabled(false);
                        vote.setEnabled(true);
                        return;
                    } else {
                        JOptionPane.showMessageDialog(frame, "You are not  eligible to vote.");
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter a valid age.");
                    return;
                }
            }
        });

        vote.addActionListener(e -> {
            String selectedGender = getSelectedGender(male, female, others);
            if (selectedGender == null) {
                JOptionPane.showMessageDialog(frame, "Please Select a Gender");

                return;
            } else {
                genderMap.put(selectedGender, genderMap.get(selectedGender) + 1);
            }
            String selectedCandidate = getSelectedCandidate(bjp, congress, aap, nota);
            if (selectedCandidate == null) {
                JOptionPane.showMessageDialog(frame, "Please Select a Candidate");

                return;
            } else {
                votes.put(selectedCandidate, votes.get(selectedCandidate) + 1);
                JOptionPane.showMessageDialog(frame,
                        "Your vote for " + selectedCandidate + " has been recorded. Thank you for voting!");
                verify.setEnabled(true);
                vote.setEnabled(false);
                ageField.setText("");
                genderGroup.clearSelection();
                candidateGroup.clearSelection();
                return;
            }

        });

        displayBtn.addActionListener(e -> {
            JLabel userLabel = new JLabel("Username: ");
            JLabel passLabel = new JLabel("Password: ");
            JTextField username = new JTextField();
            JTextField password = new JPasswordField();

            JPanel admin_creds = new JPanel();
            admin_creds.setLayout(new GridLayout(2, 2));
            admin_creds.add(userLabel);
            admin_creds.add(username);
            admin_creds.add(passLabel);
            admin_creds.add(password);
            int option = JOptionPane.showConfirmDialog(frame, admin_creds, "Enter Admin Credentials",
                    JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
            if (option == JOptionPane.OK_OPTION) {
                String userText = username.getText();
                String passText = password.getText();

                if (userText.equals("admin") && passText.equals("admin@123")) {
                    displayVoteResults();
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid Credentials");
                    return;
                }
            } else {
                return;
            }

        });

    }

    public String getSelectedGender(JRadioButton male, JRadioButton female, JRadioButton others) {
        String selectedGender = null;
        if (male.isSelected()) {
            selectedGender = "Male";
        } else if (female.isSelected()) {
            selectedGender = "Female";
        } else if (others.isSelected()) {
            selectedGender = "Others";
        } else {
            return null;
        }
        return selectedGender;
    }

    public String getSelectedCandidate(JRadioButton bjp, JRadioButton congress, JRadioButton aap, JRadioButton nota) {
        String selectedCandidate = null;
        if (bjp.isSelected()) {
            selectedCandidate = "BJP";
        } else if (congress.isSelected()) {
            selectedCandidate = "CONGRESS";
        } else if (aap.isSelected()) {
            selectedCandidate = "AAP";
        } else if (nota.isSelected()) {
            selectedCandidate = "NOTA";
        } else {
            return null;
        }
        return selectedCandidate;
    }

    public void displayVoteResults() {
        JFrame res = new JFrame("Voting Results");
        res.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        res.setSize(800, 600);

        JLabel resTitle = new JLabel("Voting Results");
        resTitle.setFont(new Font("Verdana", Font.BOLD, 48));
        resTitle.setBackground(Color.PINK);
        res.add(resTitle, BorderLayout.NORTH);

        JPanel resCenter = new JPanel();
        resCenter.setLayout(new GridLayout(0, 1, 20, 10));
        resCenter.setBackground(new Color(30, 30, 60)); // dark blue
        resCenter.setBorder(BorderFactory.createEmptyBorder(30, 60, 30, 60));

        JLabel gLabel = new JLabel("GENDER DEMOGRAPHICS");
        gLabel.setFont(new Font("Serif", Font.BOLD, 28));
        gLabel.setOpaque(true);
        gLabel.setBackground(new Color(255, 182, 193));
        gLabel.setForeground(new Color(30, 30, 60));
        gLabel.setHorizontalAlignment(SwingConstants.CENTER); 
        resCenter.add(gLabel);

        JLabel maleLabel = new JLabel("Male : " + genderMap.get("Male"));
        maleLabel.setFont(new Font("Serif", Font.PLAIN, 22));
        maleLabel.setForeground(Color.WHITE);
        maleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        resCenter.add(maleLabel);

        JLabel femaleLabel = new JLabel("Female : " + genderMap.get("Female"));
        femaleLabel.setFont(new Font("Serif", Font.PLAIN, 22));
        femaleLabel.setForeground(Color.WHITE);
        femaleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        resCenter.add(femaleLabel);

        JLabel othersLabel = new JLabel("Others : " + genderMap.get("Others"));
        othersLabel.setFont(new Font("Serif", Font.PLAIN, 22));
        othersLabel.setForeground(Color.WHITE);
        othersLabel.setHorizontalAlignment(SwingConstants.CENTER);
        resCenter.add(othersLabel);

    JFrame res = new JFrame("Voting Results");
    res.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    res.setSize(800, 600);

    JLabel resTitle = new JLabel("Voting Results");
    resTitle.setFont(new Font("Verdana", Font.BOLD, 32));
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