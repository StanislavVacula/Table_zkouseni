import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Demo extends JFrame {
    private JMenuBar jMenuBar = new JMenuBar();
    private JMenu jMenu = new JMenu("Akce");
    private JMenuItem jMenuItem = new JMenuItem("Načíst soubor");
    private JPanel panelMain;
    private JTextField textField1;
    private List<Zakaznik> data = new ArrayList<>();
    private JTable table1;

    private String jmeno1 = "Karel";
    private String jmeno2 = "Anna";
    private String jmeno3 = "Josef";
    public Demo() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Demo");
        setSize(600, 400);
        initComponents();
        naplnData();
        table1.setModel(new ZakaznikTableModel(data));
        setContentPane(panelMain);
    }
    public void initComponents() {
        setJMenuBar(jMenuBar);
        jMenuBar.add(jMenu);
        jMenu.add(jMenuItem);

        jMenuItem.addActionListener(e -> JFileChooser());
    }
    public void naplnData() {
        data.addAll(List.of(
                new Zakaznik(1, jmeno1, jmeno1.length()),
                new Zakaznik(2, jmeno2, jmeno2.length()),
                new Zakaznik(3, jmeno3, jmeno3.length())
        ));
    }
    public void JFileChooser() {
        JFileChooser jFileChooser = new JFileChooser(".");
        int result = jFileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            JOptionPane.showMessageDialog(this,"Vybraný soubor: \n"+ jFileChooser.getSelectedFile().getAbsolutePath());
        } else {
            JOptionPane.showMessageDialog(this, "Soubor nebyl načten");
        }
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.setVisible(true);
    }
}
