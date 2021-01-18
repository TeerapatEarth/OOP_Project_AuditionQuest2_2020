package View;

import Controllers.InGameController;
import Model.Character.Character;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.io.InputStream;

public class InGameButtonJPanel extends JPanel {

    private JPanel in_game_main_button_panel, empty_panel_bottom;
    private JPanel target_panel, skill_panel, bag_panel,  text_button_panel;
    private JPanel yes_no_panel, yes_no_button_panel, yes_no_text_panel;
    private JPanel item_target_panel, item_target_yes_no_panel;
    private JButton text_button;
    private JButton button_attack, button_skill, button_defense, button_bag;
    private JButton c_target_button, m1_target_button, m2_target_button, back_button;
    private JButton skill1_button, skill2_button, skill3_button, skill_back_button;
    private JButton item1_button, item2_button, item3_button, item_back_button;
    private JButton button_yes, button_no;
    private JButton item_target_c1_button, item_target_c2_button, item_target_back_button;
    private JLabel item_get_label;

    private Icon bg;

    private CardLayout card_select;

    public Font font, sizedFont;

    private Border border_white = new LineBorder(Color.WHITE, 4, true);
    private Border border_red = new LineBorder(new Color(255, 72, 59), 4, true);
    private Border border_green = new LineBorder(new Color(0, 255, 0), 4, true);

    private Color button_select = new Color(120, 125, 129);

    private InGameController inGameController;

    public InGameButtonJPanel(InGameController igc){
        inGameController = igc;
        createComponents();
        setComponents();
    }

    private void createComponents(){

        in_game_main_button_panel = new JPanel();

        target_panel = new JPanel();

        text_button_panel = new JPanel();

        skill_panel = new JPanel();

        bag_panel = new JPanel();

        yes_no_panel = new JPanel();
        yes_no_button_panel = new JPanel();
        yes_no_text_panel = new JPanel();

        item_target_panel = new JPanel();
        item_target_yes_no_panel = new JPanel();

        item_get_label = new JLabel("Do you want to keep this item ?");

        bg = new ImageIcon(getClass().getResource("img/text_click.png"));
        text_button = new JButton("", bg);

        button_attack = new JButton();
        button_skill = new JButton();
        button_defense = new JButton();
        button_bag = new JButton();

        c_target_button = new JButton();
        m1_target_button = new JButton();
        m2_target_button = new JButton();
        back_button = new JButton("Back");

        skill1_button = new JButton();
        skill2_button = new JButton();
        skill3_button = new JButton();
        skill_back_button = new JButton("Back");

        item1_button = new JButton();
        item2_button = new JButton();
        item3_button = new JButton();
        item_back_button = new JButton("Back");

        button_yes = new JButton("Yes");
        button_no = new JButton("No");

        item_target_c1_button = new JButton();
        item_target_c2_button = new JButton();
        item_target_back_button = new JButton("Back");

        empty_panel_bottom = new JPanel();

        card_select = new CardLayout();

    }

    private void setComponents(){

        ToolTipManager.sharedInstance().setInitialDelay(100);

        try {

            InputStream is = InGameJPanel.class.getResourceAsStream("Font/Retron2000.ttf");
            font = Font.createFont(Font.TRUETYPE_FONT, is);
            sizedFont = font.deriveFont(12f);

            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(font);

        } catch (Exception e){}

        this.setLayout(card_select);

        in_game_main_button_panel.setLayout(new GridLayout(2, 2));

        try {

            button_attack.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("img/b1.png"))));
            button_attack.setFocusable(false);
            button_attack.addMouseListener(inGameController);
            button_attack.addActionListener(inGameController);

            button_skill.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("img/b2.png"))));
            button_skill.setFocusable(false);
            button_skill.addMouseListener(inGameController);
            button_skill.addActionListener(inGameController);

            button_defense.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("img/b3.png"))));
            button_defense.setFocusable(false);
            button_defense.addMouseListener(inGameController);
            button_defense.addActionListener(inGameController);

            button_bag.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("img/b4.png"))));
            button_bag.setFocusable(false);
            button_bag.addMouseListener(inGameController);
            button_bag.addActionListener(inGameController);

        } catch (Exception e){}

        in_game_main_button_panel.add(button_attack);
        in_game_main_button_panel.add(button_skill);
        in_game_main_button_panel.add(button_defense);
        in_game_main_button_panel.add(button_bag);

//        c_target_button.setBackground(button_select);
//        c_target_button.setFont(sizedFont.deriveFont(Font.BOLD, 25));
//        c_target_button.setForeground(Color.WHITE);
//        c_target_button.addMouseListener(inGameController);
//        c_target_button.addActionListener(inGameController);
//
//        m1_target_button.setBackground(button_select);
//        m1_target_button.setFont(sizedFont.deriveFont(Font.BOLD, 25f));
//        m1_target_button.setForeground(Color.WHITE);
//        m1_target_button.addMouseListener(inGameController);
//        m1_target_button.addActionListener(inGameController);
//
//        m2_target_button.setBackground(button_select);
//        m2_target_button.setFont(sizedFont.deriveFont(Font.BOLD, 25f));
//        m2_target_button.setForeground(Color.WHITE);
//        m2_target_button.addMouseListener(inGameController);
//        m2_target_button.addActionListener(inGameController);
//
//        back_button.setBackground(button_select);
//        back_button.setFont(sizedFont.deriveFont(Font.BOLD, 25f));
//        back_button.setForeground(Color.WHITE);
//        back_button.addMouseListener(inGameController);
//        back_button.addActionListener(inGameController);

        setButton(c_target_button, 25);
        setButton(m1_target_button, 25);
        setButton(m2_target_button, 25);
        setButton(back_button, 25);

        target_panel.setLayout(new GridLayout(2, 2));
        target_panel.add(back_button);
        target_panel.add(m1_target_button);
        target_panel.add(c_target_button);
        target_panel.add(m2_target_button);

//        skill1_button.setBackground(button_select);
//        skill1_button.setFont(sizedFont.deriveFont(Font.BOLD, 22f));
//        skill1_button.setForeground(Color.WHITE);
//        skill1_button.addMouseListener(inGameController);
//        skill1_button.addActionListener(inGameController);
//
//        skill2_button.setBackground(button_select);
//        skill2_button.setFont(sizedFont.deriveFont(Font.BOLD, 22f));
//        skill2_button.setForeground(Color.WHITE);
//        skill2_button.addMouseListener(inGameController);
//        skill2_button.addActionListener(inGameController);
//
//        skill3_button.setBackground(button_select);
//        skill3_button.setFont(sizedFont.deriveFont(Font.BOLD, 22f));
//        skill3_button.setForeground(Color.WHITE);
//        skill3_button.addMouseListener(inGameController);
//        skill3_button.addActionListener(inGameController);
//
//        skill_back_button.setBackground(button_select);
//        skill_back_button.setFont(sizedFont.deriveFont(Font.BOLD, 22f));
//        skill_back_button.setForeground(Color.WHITE);
//        skill_back_button.addMouseListener(inGameController);
//        skill_back_button.addActionListener(inGameController);

        setButton(skill1_button, 22);
        setButton(skill2_button, 22);
        setButton(skill3_button, 22);
        setButton(skill_back_button, 22);

        skill_panel.setLayout(new GridLayout(2, 2));
        skill_panel.add(skill_back_button);
        skill_panel.add(skill1_button);
        skill_panel.add(skill2_button);
        skill_panel.add(skill3_button);

//        item1_button.setBackground(button_select);
//        item1_button.setFont(sizedFont.deriveFont(Font.BOLD, 22f));
//        item1_button.setForeground(Color.WHITE);
//        item1_button.addMouseListener(inGameController);
//        item1_button.addActionListener(inGameController);
//
//        item2_button.setBackground(button_select);
//        item2_button.setFont(sizedFont.deriveFont(Font.BOLD, 22f));
//        item2_button.setForeground(Color.WHITE);
//        item2_button.addMouseListener(inGameController);
//        item2_button.addActionListener(inGameController);
//
//        item3_button.setBackground(button_select);
//        item3_button.setFont(sizedFont.deriveFont(Font.BOLD, 22f));
//        item3_button.setForeground(Color.WHITE);
//        item3_button.addMouseListener(inGameController);
//        item3_button.addActionListener(inGameController);
//
//        item_back_button.setBackground(button_select);
//        item_back_button.setFont(sizedFont.deriveFont(Font.BOLD, 22f));
//        item_back_button.setForeground(Color.WHITE);
//        item_back_button.addMouseListener(inGameController);
//        item_back_button.addActionListener(inGameController);

        setButton(item1_button, 22);
        setButton(item2_button, 22);
        setButton(item3_button, 22);
        setButton(item_back_button, 22);

        bag_panel.setLayout(new GridLayout(2, 2));
        bag_panel.add(item_back_button);
        bag_panel.add(item1_button);
        bag_panel.add(item2_button);
        bag_panel.add(item3_button);

        item_get_label.setFont(sizedFont.deriveFont(Font.BOLD, 20f));
        item_get_label.setForeground(Color.WHITE);

        yes_no_text_panel.setLayout(new GridBagLayout());
        yes_no_text_panel.setBackground(button_select);
        yes_no_text_panel.add(item_get_label);

//        button_yes.setBackground(button_select);
//        button_yes.setFont(sizedFont.deriveFont(Font.BOLD, 22f));
//        button_yes.setForeground(Color.WHITE);
//        button_yes.addMouseListener(inGameController);
//        button_yes.addActionListener(inGameController);
//
//        button_no.setBackground(button_select);
//        button_no.setFont(sizedFont.deriveFont(Font.BOLD, 22f));
//        button_no.setForeground(Color.WHITE);
//        button_no.addMouseListener(inGameController);
//        button_no.addActionListener(inGameController);

        setButton(button_yes, 22);
        setButton(button_no, 22);

        yes_no_button_panel.setLayout(new GridLayout(1, 2));
        yes_no_button_panel.add(button_yes);
        yes_no_button_panel.add(button_no);

        yes_no_panel.setLayout(new GridLayout(2, 1));
        yes_no_panel.add(yes_no_text_panel);
        yes_no_panel.add(yes_no_button_panel);

        setButton(item_target_back_button, 25);
        setButton(item_target_c1_button, 25);
        setButton(item_target_c2_button, 25);

        item_target_yes_no_panel.setLayout(new GridLayout(1, 2));
        item_target_yes_no_panel.add(item_target_c1_button);
        item_target_yes_no_panel.add(item_target_c2_button);

        item_target_panel.setLayout(new GridLayout(2, 1));
        item_target_panel.add(item_target_back_button);
        item_target_panel.add(item_target_yes_no_panel);

        text_button_panel.setLayout(new BorderLayout());

//        text_button.setBackground(button_select);
//        text_button.setFont(sizedFont.deriveFont(Font.BOLD, 25f));
//        text_button.setForeground(Color.WHITE);
//        text_button.addMouseListener(inGameController);
//        text_button.addActionListener(inGameController);
        setButton(text_button, 25);
        text_button.setHorizontalTextPosition(JButton.CENTER);
        text_button.setVerticalTextPosition(JButton.CENTER);

        text_button_panel.add(text_button);

        empty_panel_bottom.setBackground(button_select);

        this.add("main_select", in_game_main_button_panel);
        this.add("target_select", target_panel);
        this.add("skill_select", skill_panel);
        this.add("item_select", bag_panel);
        this.add("text_button", text_button_panel);
        this.add("empty", empty_panel_bottom);
        this.add("yes_no", yes_no_panel);
        this.add("item_target", item_target_panel);
        card_select.show(this, "main_select");

    }

    public void setTextToSkillButton(Character c){

        skill1_button.setText("<html><font face='Retron2000'><center>" + c.getSkill1_name() + "</html>");
        skill1_button.setToolTipText("<html><font face='Retron2000'><center><p style='text-align: left'>" + c.getSkill1_description() + "</p></html>");

        skill2_button.setText("<html><font face='Retron2000'><center>" + c.getSkill2_name() + "</html>");
        skill2_button.setToolTipText("<html><font face='Retron2000'><center><p style='text-align: left'>" + c.getSkill2_description() + "</p></html>");

        skill3_button.setText("<html><font face='Retron2000'><center>" + c.getSkill3_name() + "</html>");
        skill3_button.setToolTipText("<html><font face='Retron2000'><center><p style='text-align: left'>" + c.getSkill3_description() + "</p></html>");

    }

    public void setTextToItemButton(Character c){
        setItemButtonToNull();
        if (c.getBag().get(0) != null) {
            item1_button.setText("<html><font face='Retron2000'><center>" + c.getBag().get(0).getName() + "</html>");
            item1_button.setToolTipText("<html><font face='Retron2000'><center><p style='text-align: left'>" + c.getBag().get(0).getDescription() + "</p></html>");
        }

        if (c.getBag().get(1) != null) {
            item2_button.setText("<html><font face='Retron2000'><center>" + c.getBag().get(1).getName() + "</html>");
            item2_button.setToolTipText("<html><font face='Retron2000'><center><p style='text-align: left'>" + c.getBag().get(1).getDescription() + "</p></html>");
        }

        if (c.getBag().get(2) != null) {
            item3_button.setText("<html><font face='Retron2000'><center>" + c.getBag().get(2).getName() + "</html>");
            item3_button.setToolTipText("<html><font face='Retron2000'><center><p style='text-align: left'>" + c.getBag().get(2).getDescription() + "</p></html>");
        }
    }

    public void setItemButtonToNull(){
        item1_button.setText(null);
        item1_button.setToolTipText(null);

        item2_button.setText(null);
        item2_button.setToolTipText(null);

        item3_button.setText(null);
        item3_button.setToolTipText(null);
    }

    public void setButton(JButton b, int size){
        b.setBackground(button_select);
        b.setFont(sizedFont.deriveFont(Font.BOLD, size));
        b.setForeground(Color.WHITE);
        b.addMouseListener(inGameController);
        b.addActionListener(inGameController);
    }

    public CardLayout getCard_select() {
        return card_select;
    }

    public void setCard_select(CardLayout card_select) {
        this.card_select = card_select;
    }

    public JButton getText_button() {
        return text_button;
    }

    public void setText_button(JButton text_button) {
        this.text_button = text_button;
    }

    public JButton getButton_attack() {
        return button_attack;
    }

    public void setButton_attack(JButton button_attack) {
        this.button_attack = button_attack;
    }

    public JButton getButton_skill() {
        return button_skill;
    }

    public void setButton_skill(JButton button_skill) {
        this.button_skill = button_skill;
    }

    public JButton getButton_defense() {
        return button_defense;
    }

    public void setButton_defense(JButton button_defense) {
        this.button_defense = button_defense;
    }

    public JButton getButton_bag() {
        return button_bag;
    }

    public void setButton_bag(JButton button_bag) {
        this.button_bag = button_bag;
    }

    public JButton getC_target_button() {
        return c_target_button;
    }

    public void setC_target_button(JButton c_target_button) {
        this.c_target_button = c_target_button;
    }

    public JButton getM1_target_button() {
        return m1_target_button;
    }

    public void setM1_target_button(JButton m1_target_button) {
        this.m1_target_button = m1_target_button;
    }

    public JButton getM2_target_button() {
        return m2_target_button;
    }

    public void setM2_target_button(JButton m2_target_button) {
        this.m2_target_button = m2_target_button;
    }

    public JButton getBack_button() {
        return back_button;
    }

    public void setBack_button(JButton back_button) {
        this.back_button = back_button;
    }

    public Border getBorder_white() {
        return border_white;
    }

    public void setBorder_white(Border border_white) {
        this.border_white = border_white;
    }

    public Border getBorder_red() {
        return border_red;
    }

    public void setBorder_red(Border border_red) {
        this.border_red = border_red;
    }

    public Border getBorder_green() {
        return border_green;
    }

    public void setBorder_green(Border border_green) {
        this.border_green = border_green;
    }

    public JPanel getText_button_panel() {
        return text_button_panel;
    }

    public void setText_button_panel(JPanel text_button_panel) {
        this.text_button_panel = text_button_panel;
    }

    public JButton getSkill1_button() {
        return skill1_button;
    }

    public void setSkill1_button(JButton skill1_button) {
        this.skill1_button = skill1_button;
    }

    public JButton getSkill2_button() {
        return skill2_button;
    }

    public void setSkill2_button(JButton skill2_button) {
        this.skill2_button = skill2_button;
    }

    public JButton getSkill3_button() {
        return skill3_button;
    }

    public void setSkill3_button(JButton skill3_button) {
        this.skill3_button = skill3_button;
    }

    public JButton getSkill_back_button() {
        return skill_back_button;
    }

    public void setSkill_back_button(JButton skill_back_button) {
        this.skill_back_button = skill_back_button;
    }

    public JButton getItem1_button() {
        return item1_button;
    }

    public void setItem1_button(JButton item1_button) {
        this.item1_button = item1_button;
    }

    public JButton getItem2_button() {
        return item2_button;
    }

    public void setItem2_button(JButton item2_button) {
        this.item2_button = item2_button;
    }

    public JButton getItem3_button() {
        return item3_button;
    }

    public void setItem3_button(JButton item3_button) {
        this.item3_button = item3_button;
    }

    public JButton getItem_back_button() {
        return item_back_button;
    }

    public void setItem_back_button(JButton item_back_button) {
        this.item_back_button = item_back_button;
    }

    public JButton getButton_yes() {
        return button_yes;
    }

    public void setButton_yes(JButton button_yes) {
        this.button_yes = button_yes;
    }

    public JButton getButton_no() {
        return button_no;
    }

    public void setButton_no(JButton button_no) {
        this.button_no = button_no;
    }

    public JLabel getItem_get_label() {
        return item_get_label;
    }

    public void setItem_get_label(JLabel item_get_label) {
        this.item_get_label = item_get_label;
    }

    public JButton getItem_target_c1_button() {
        return item_target_c1_button;
    }

    public void setItem_target_c1_button(JButton item_target_c1_button) {
        this.item_target_c1_button = item_target_c1_button;
    }

    public JButton getItem_target_c2_button() {
        return item_target_c2_button;
    }

    public void setItem_target_c2_button(JButton item_target_c2_button) {
        this.item_target_c2_button = item_target_c2_button;
    }

    public JButton getItem_target_back_button() {
        return item_target_back_button;
    }

    public void setItem_target_back_button(JButton item_target_back_button) {
        this.item_target_back_button = item_target_back_button;
    }
}
