
    public class Date {

        //  Zona de Atributos
        private int day; // Dia de la fecha
        private int month; // Mes de la fecha
        private int year; // Año de la fecha

        // Zona de Metodos (Constructores)
        public Date(int day, int month, int year){
            this.day = day;
            this.month = month;
            this.year = year;
        }

        public int getDay(){
            return day;
        }

        public int getMonth(){
            return month;
        }
        public int getYear(){
            return year;
        }

        public void setDay(int day){
            this.day = day;
        }

        public void setMonth(int month){
            this.month = month;
        }

        public void setYear(int year){
            this.year = year;
        }

        public void setDate(int day, int month, int year){
            this.day = day;
            this.month = month;
            this.year = year;
        }

        public String toString(){
            return day + "/" + month + "/" + year;
        }
    }

