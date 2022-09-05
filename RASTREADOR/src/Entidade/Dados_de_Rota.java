package Entidade;



public class Dados_de_Rota {
    
    private int cli;
    private float longitude;
    private float latitude;
    private float altitude;
    private int data;
    //private java.sql.Date Data_Coleta;
            
            //SimpleDateFormat Time_Coleta = new SimpleDateFormat(Data_Coleta);



           public int getID_Usuario() {
                return cli;
            }



           public void setID_Usuario(int iD_Usuario) {
                this.cli = iD_Usuario;
            }

           public int getData() {
               return data;
           }



          public void setData(int data) {
               this.data = data;
           }


           public float getLongitude() {
                return longitude;
            }



           public void setLongitude(float longitude) {
                this.longitude = longitude;
            }



           public float getLatitude() {
                return latitude;
            }



           public void setLatitude(float latitude) {
                this.latitude = latitude;
            }



           public float getAltitude() {
                return altitude;
            }



           public void setAltitude(float altitude) {
                this.altitude = altitude;
            }



           /*public java.sql.Date getData_Coleta() {
                return Data_Coleta;
            }



           public void setData_Coleta(java.sql.Date date) {
                Data_Coleta = date;
            }*/



           
            public Dados_de_Rota(int iD_Usuario, float longitude, float latitude, float altitude, int data) {
                this.cli = iD_Usuario;
                this.longitude = longitude;
                this.latitude = latitude;
                this.altitude = altitude;
                this.data = data;
                //Data_Coleta = data_Coleta;
                
            }

     

           /*public void setData_Coleta(Date date) {
                // TODO Auto-generated method stub
                
            }*/
    



           
            
            
}