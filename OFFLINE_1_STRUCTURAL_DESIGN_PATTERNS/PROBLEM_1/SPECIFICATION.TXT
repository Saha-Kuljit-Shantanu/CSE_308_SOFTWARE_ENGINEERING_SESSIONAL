Assume you are given a task to implement a PC manufacturing system which can create four
types of PC including one gaming PC which contains AMD Ryzen 7 5700X processor having a
cost of 28,000 BDT whereas other PCS have 11th generation intel processor respectively Core
i5, Core i7, Core i9. Your system should be able to continuously customize PCs to meet customer
requirements and deliver the product. All the PCs have CPU, motherboard, 1 TB HDD and the
base price for all the PCs is 70,000 BDT. The first type PC has a CPU cooler of 36000 BDT, the
second PC uses a liquid cooler of 17000 BDT and the third PC contains a DVD drive having a
price of 6000 BDT. The price of the Intel processors used by the regular PCs are respectively
20,000 BDT, 37000 BDT, 65,000 BDT.

The users can add 8 GB DDR4 RAM of two variations including 2666 MHz and 3200 MHz to
all types of PC adding respectively 2620 BDT and 2950 BDT to the base price. They can also
enable 2GB and 4 GB graphics cards adding respectively 6500 BDT and 7600 BDT. You must
ensure that all PCs handle these customization.

After the order placing is done, the code should output the names of the PCs ordered, the base
and added components, and the individual base and total prices (in case of a price increase,
mention why the pricing increased). You have to perform this using a print function.
Please note that there can be multiple orders during a run. However, the orders are sequential. If
'O' is pressed, an order opens, and if 'E' is pressed, the order closes. If one tries to open another
order while a current order is ongoing, you should show an error message, and ask if he wants to
include something else in the previous order. Once placed, an order cannot be changed.
Moreover, ensure that there is at least one item in an order before closing it. Think of a few more
boundary cases and include those in your code
