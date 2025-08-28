class CostItemsVar{
    public static void main(String[] args) {
        float penCost = 10.5f;
        float pemcilCost = 5.5f;
        float eraserCost = 2.5f;
        float totalCost = penCost + pemcilCost + eraserCost;
        int gst = 18;
        float gstAmount = (totalCost * gst) / 100;
        float finalAmount = totalCost + gstAmount;
        System.out.println("Final amount after adding GST: " + finalAmount);
    }
}