package de.oskar.exercises.nine;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class TabelleTableModel extends AbstractTableModel {

    private final Tabelle tabelle;
    private final List<TabellenEintrag> entries;

    public TabelleTableModel(Tabelle tabelle) {
        this.tabelle = tabelle;
        this.entries = tabelle.getTabellenEintragList();
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0: return "Platz";
            case 1: return "Club";
            case 2: return "Punkte";
            default: return null;
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0: return false;
            case 1, 2: return true;
            default: return false;
        }
    }

    @Override
    public int getRowCount() {
        return this.entries.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        TabellenEintrag tabellenEintrag = this.entries.get(rowIndex);

        System.out.println(aValue.getClass());

        switch (columnIndex) {
            case 1: tabellenEintrag.setClubName((String) aValue);
            case 2: {
                this.tabelle.updatePunkte(rowIndex, Integer.parseInt(aValue.toString()));
            }
            default: return;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        TabellenEintrag tabellenEintrag = this.entries.get(rowIndex);
        switch (columnIndex) {
            case 0: return tabellenEintrag.getPlatz();
            case 1: return tabellenEintrag.getClubName();
            case 2: return tabellenEintrag.getPunkte();
            default: return null;
        }
    }
}
