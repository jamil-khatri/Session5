class SearchProduct {

    void searchProduct(String name) {
        System.out.println("Searching product: " + name);
    }

    void searchProduct(String name, String category) {
        System.out.println("Searching " + name +
                           " in category " + category);
    }

    public static void main(String[] args) {
        SearchProduct s = new SearchProduct();

        s.searchProduct("Laptop");
        s.searchProduct("Laptop", "Electronics");
    }
}
