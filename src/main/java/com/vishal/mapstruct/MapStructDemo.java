package com.vishal.mapstruct;

/**
 * Created by k.vishal on 07/04/16.
 */
public class MapStructDemo {

    public static void main(String str[]){

        int iterate =400000;
        ItemDao item = new ItemDao();
        item.setItemName("bhjbjr");
        item.setItemId("njbvf");
        item.setItemPrice(33.23);
        ShipmentDao shipmentDao = new ShipmentDao("2223",123.23,43,1223.23,item);

        long start = System.nanoTime();
        for (int ii = 0; ii < iterate; ii++) {

            ShipmentDto shipmentDto = ShipmentMapper.INSTANCE.shipmentDaoToShipmentDto(shipmentDao,item);

//            System.out.println(shipmentDto.getId());
//            System.out.println(shipmentDto.getItemQuantity());
//            System.out.println(shipmentDto.getPrice());
//            System.out.println(shipmentDto.getSize());
//            System.out.println(shipmentDto.getOwner());
//            System.out.println(shipmentDto.getItemId());
//            System.out.println(shipmentDto.getItemPrice());
//            System.out.println(shipmentDto.getItemName());
        }
        long elapsed = System.nanoTime() - start;
        System.out.println("elapsed time = " + elapsed + " nano seconds" + " OR " + elapsed/1000000 + " milliseconds");
//        System.out.println((elapsed * 1000.0) / iterate + " microseconds per execution");
        System.out.println((elapsed) / iterate + " nano seconds "  + " OR " + elapsed/(iterate*1000000) + " milliseconds " + "per execution");
    }
}
