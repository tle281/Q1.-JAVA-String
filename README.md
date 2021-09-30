ItemSeparator is a class which filters a given raw input string of the format "ItemName$$##ItemPrice$$##ItemQuantity", 
and stores it as these class attributes:
  name (String)
  price (Double)
  quantity (Integer)

Implement the constructor ItemSeparator(String rawInput) as well as the getter methods for all the 3 attributes of the class ItemSeperator:
  String getName
  Double getPrice
  Integer getQuantity

Once submitted, a hidden Solution class will check the code by calling appropriate methods.
  Sample Input:
    Bread$$##12.5$$##10
  Sample Output:
    Item Name: Bread
    Item Price: 12.5
    Item Quantity: 10
