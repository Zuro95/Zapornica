/*
			Ime dototeke:    TestZapornica.java
			Avtor:           Žiga Zurc			
*/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;


public class TestZapornica extends DefaultTableModel implements ActionListener {
public static void main(String[] args) {
	private Class<?>[] columnTypes;
    
    public MyTableModel(String[] columnNames, Class<?>[] columnTypes) {
        super(columnNames, 0);
        this.columnTypes = columnTypes;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return columnTypes[columnIndex];
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
        Object[] rowData = {property1, property2, property3,};
        addRow(rowData);
    }
	 Scanner scanner = new Scanner(System.in);
	 
	List<Zapornica> zapornice = new ArrayList<>();
	
	 while (true) {
            System.out.print("Vnesite cas zapiranja zapornice (prazna vrstica za konec): ");      
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }

            try {
                int casZapiranja = Integer.parseInt(input);
                zapornice.add(new Zapornica(casZapiranja));
            } catch (NumberFormatException e) {
                System.out.println("Napaka pri branju vnosa: " + e.getMessage());
            }
        }
	
	
	
	
	
	
        zapornice.add(new Zapornica(10));
        zapornice.add(new Zapornica(20));

        for (Zapornica zapornica : zapornice) {
            try {
                zapornica.odpre();
                zapornica.odpre(); // This should throw a GateStateException
            } catch (GateStateException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Seznam zapornic:");
        for (Zapornica zapornica : zapornice) {
            System.out.println("Zapornica: zaprta=" + zapornica.isZaprta() +
                    ", preostali cas=" + zapornica.getPreostaliCas() +
                    ", cas zapiranja=" + zapornica.getCasZapiranja());
        }
    							
	Zapornica zapornica = new Zapornica(10);

        try {
            zapornica.odpre();
            zapornica.odpre(); 
        } catch (GateStateException e) {
            System.out.println(e.getMessage());
	
	Scanner sc = new Scanner(System.in);
        Zapornica zapornica1 = new Zapornica(10);
        Zapornica zapornica2 = new Zapornica(20);
        Zapornica zapornica3 = new Zapornica(30);
		PolavtomatskaZapornica zapornicaPol = new PolavtomatskaZapornica(20);
        AvtomatskaZapornica zapornicaA = new AvtomatskaZapornica(30);
		
        // Izpis stanja zapornic
        System.out.println("Stanje zapornic:");
        System.out.println("Zapornica 1: " + zapornica1.isZaprta() + ", preostali čas: " + zapornica1.getPreostaliCas());
        System.out.println("Zapornica 2: " + zapornica2.isZaprta() + ", preostali čas: " + zapornica2.getPreostaliCas());
        System.out.println("Zapornica 3: " + zapornica3.isZaprta() + ", preostali čas: " + zapornica3.getPreostaliCas());
        System.out.println();

        // Zapiranje zapornic
        zapornica1.zapri();
        zapornica2.zapri();
        zapornica3.zapri();
        System.out.println("Zapornice so se zaprle.");
        System.out.println();

        // Izpis stanja zapornic
        System.out.println("Stanje zapornic:");
        System.out.println("Zapornica 1: " + zapornica1.isZaprta() + ", preostali čas: " + zapornica1.getPreostaliCas());
        System.out.println("Zapornica 2: " + zapornica2.isZaprta() + ", preostali čas: " + zapornica2.getPreostaliCas());
        System.out.println("Zapornica 3: " + zapornica3.isZaprta() + ", preostali čas: " + zapornica3.getPreostaliCas());
        System.out.println();

        // Preverjanje preostalega časa
        for (int i = 0; i < 4; i++) {
            zapornica1.tik();
            zapornica2.tik();
            zapornica3.tik();
        }
        System.out.println("Preostali čas po dodatnih 4 sekundah:");
        System.out.println("Zapornica 1: " + zapornica1.isZaprta() + ", preostali čas: " + zapornica1.getPreostaliCas());
        System.out.println("Zapornica 2: " + zapornica2.isZaprta() + ", preostali čas: " + zapornica2.getPreostaliCas());
        System.out.println("Zapornica 3: " + zapornica3.isZaprta() + ", preostali čas: " + zapornica3.getPreostaliCas());
		System.out.println();
		
		    // Odpiranje zapornic
				zapornica1.odpre();
				zapornica2.odpre();
				zapornica3.odpre();
				System.out.println("Zapornice so se odprle.");
				System.out.println();


    // Izpis stanja zapornic
    System.out.println("Stanje zapornic:");
    System.out.println("Zapornica 1: " + zapornica1.isZaprta() + ", preostali čas: " + zapornica1.getPreostaliCas());
    System.out.println("Zapornica 2: " + zapornica2.isZaprta() + ", preostali čas: " + zapornica2.getPreostaliCas());
    System.out.println("Zapornica 3: " + zapornica3.isZaprta() + ", preostali čas: " + zapornica3.getPreostaliCas());
    System.out.println();
 }
 
 
  // Izpis stanja zapornic
        System.out.println("Stanje zapornic:");
        System.out.println("Zapornica 1: " + zapornicaPol.isZaprta());
		
		
		// Vprašamo uporabnika po tipu zapornice
        System.out.println("Izberite tip zapornice: [1] avtomatska, [2] polavtomatska, [3] navadna");
        int tip = sc.nextInt();
		
		// Ustvarimo objekt glede na izbiro uporabnika
        Zapornica zapornica;
        if (tip == 1) {
            System.out.println("Vnesite dolžino avtomatske zapornice:");
            int dolzina = sc.nextInt();
            zapornica = new AvtomatskaZapornica(dolzina);
        } else if (tip == 2) {
            System.out.println("Vnesite dolžino polavtomatske zapornice:");
            int dolzina = sc.nextInt();
            zapornica = new PolavtomatskaZapornica(dolzina);
        } else {
            System.out.println("Vnesite preostali čas navadne zapornice:");
            int preostaliCas = sc.nextInt();
            zapornica = new Zapornica(preostaliCas);
        }

        // Izpis stanja zapornice
        System.out.println("Stanje zapornice: " + zapornica.isZaprta());

        // Zapiranje in odpiranje zapornice
        zapornica.zapri();
        System.out.println("Stanje zapornice po zapiranju: " + zapornica.isZaprta());

        zapornica.odpri();
        System.out.println("Stanje zapornice po odpiranju: " + zapornica.isZaprta());
		
		
		// Ustvarjanje zapornic z dolžinami, ki jih vnese uporabnik
    System.out.println("Vnesite dolžino prve zapornice:");
    int dolzina1 = sc.nextInt();
    zapornica1 = new Zapornica(dolzina1);

    System.out.println("Vnesite dolžino druge zapornice:");
    int dolzina2 = sc.nextInt();
    zapornica2 = new Zapornica(dolzina2);

    System.out.println("Vnesite dolžino tretje zapornice:");
    int dolzina3 = sc.nextInt();
    zapornica3 = new Zapornica(dolzina3);

    System.out.println("Vnesite dolžino polavtomatske zapornice:");
    int dolzinaPol = sc.nextInt();
    zapornicaPol = new PolavtomatskaZapornica(dolzinaPol);

    System.out.println("Vnesite dolžino avtomatske zapornice:");
    int dolzinaA = sc.nextInt();
    zapornicaA = new AvtomatskaZapornica(dolzinaA);
		
		
		
		
		
}		
    }
		
		
		
		
		

