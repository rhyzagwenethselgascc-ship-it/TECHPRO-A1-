public class Seatwork1 {

        public static void main(String[] args) {

                Product p = new Product("Gaming Mouse", 1500.5, 3);

                        System.out.println("2nd sem Seatwork 1");
                                System.out.println("Product Name: " + p.getProductName());
                                        System.out.println("Price: " + p.getPrice());
                                                System.out.println("Quantity: " + p.getQuantity());
                                                        System.out.println("Total Amount: " + p.getTotalAmount());
                                                            }
                                                            }

                                                            class Product {

                                                                private String productName;
                                                                    private double price;
                                                                        private int quantity;

                                                                            Product(String productName, double price, int quantity) {
                                                                                    this.setProductName(productName);
                                                                                            this.setPrice(price);
                                                                                                    this.setQuantity(quantity);
                                                                                                        }

                                                                                                            public String getProductName() {
                                                                                                                    return this.productName;
                                                                                                                        }

                                                                                                                            public double getPrice() {
                                                                                                                                    return this.price;
                                                                                                                                        }

                                                                                                                                            public int getQuantity() {
                                                                                                                                                    return this.quantity;
                                                                                                                                                        }

                                                                                                                                                            public void setProductName(String productName) {
                                                                                                                                                                    this.productName = productName;
                                                                                                                                                                        }

                                                                                                                                                                            public void setPrice(double price) {
                                                                                                                                                                                    this.price = price;
                                                                                                                                                                                        }

                                                                                                                                                                                            public void setQuantity(int quantity) {
                                                                                                                                                                                                    this.quantity = quantity;
                                                                                                                                                                                                        }

                                                                                                                                                                                                            public double getTotalAmount() {
                                                                                                                                                                                                                    return this.price * this.quantity;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        }
}