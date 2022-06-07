package tables;

public class Table {
    Table[] tables;
    public Table(int tablecount){
        this.tables=new Table[tablecount];
        for (int i=0;i<this.tables.length;i++){
            this.tables[i]=new Table(0);

        }

    }
}
