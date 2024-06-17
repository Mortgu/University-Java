package de.oskar.exercises.nine;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tabelle extends JFrame {

    private final List<TabellenEintrag> tabellenEintragList;
    private final TabelleTableModel tabelleTableModel;

    public Tabelle() {
        this.tabellenEintragList = new ArrayList<>();
        this.tabelleTableModel = new TabelleTableModel(this);
    }

    void addEintrag(String clubName, int punkte) {
        this.tabellenEintragList.add(new TabellenEintrag(1, clubName, punkte));
        this.updateOrder();
    }

    TabellenEintrag getEintrag(int index) {
        return this.tabellenEintragList.get(index);
    }

    void updatePunkte(int index, int punkte) {
        this.tabellenEintragList.get(index).setPunkte(punkte);
        this.updateOrder();
    }

    public List<TabellenEintrag> getTabellenEintragList() {
        return tabellenEintragList;
    }

    public void updateOrder() {
        Collections.sort(this.getTabellenEintragList(), (o1, o2) ->  o2.getPunkte() - o1.getPunkte());

        for (int i = 0; i < this.getTabellenEintragList().size(); i++) {
            this.getTabellenEintragList().get(i).setPlatz(i + 1);
        }
    }

    public void build() {
        JTable table = new JTable(tabelleTableModel);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JScrollPane scrollPane = new JScrollPane(table);

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Tabelle"));

        panel.setLayout(new BorderLayout());
        panel.add(scrollPane);

        add(panel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
