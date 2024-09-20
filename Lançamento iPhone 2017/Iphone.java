public class Iphone {
    
    public class iPhone implements MusicPlayer, Phone, WebBrowser  {
        private String modelo;
        private int capacidade;
    
        public iPhone(String modelo, int capacidade) {
            this.modelo = modelo;
            this.capacidade = capacidade;
        }
    
        // Métodos da interface Phone
        
        public void call(String number) {
            System.out.println("Chamando " + number + "...");
        }
    
        
        public void receiveCall(String number) {
            System.out.println("Recebendo chamada de " + number + "...");
        }
    
        
        public void sendMessage(String number, String message) {
            System.out.println("Enviando mensagem para " + number + ": " + message);
        }
    
        // Métodos da interface MusicPlayer
        
        public void play() {
            System.out.println("Tocando música...");
        }
    
        
        public void pause() {
            System.out.println("Pausando música...");
        }
    
        
        public void stop() {
            System.out.println("Parando música...");
        }
    
        // Métodos da interface WebBrowser
        
        public void openURL(String url) {
            System.out.println("Abrindo URL: " + url);
        }
    
        
        public void navigate(String direction) {
            System.out.println("Navegando para " + direction + "...");
        }
    
        
        public void addFavorite(String url) {
            System.out.println("Adicionando " + url + " aos favoritos.");
        }
    }
    
}
