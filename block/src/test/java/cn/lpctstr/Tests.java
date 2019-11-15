package cn.lpctstr;

/**
 * @Author:LPCTSTR_MSR
 * @Description: Null
 * @Date: 18:48 2019/7/15
 * @Project: ZJSRTP
 */
public class Tests {
//
//    @Test
//    public void test() throws InterruptedException {
//        PCTable<ICommand> table = new PCTable<>(new ICommand[20]);
//        ObjSender sender = new ObjSender.Builder("localhost").setTag("Sender").build();
//        ObjReceiver receiver = new ObjReceiver.Builder(table).setTag("Receiver").build();
//        receiver.begin();
//        sender.begin();
//        sender.write(new TransCommand("CJ", "!!!", "2222"));
//        sender.write(new TransCommand("CJ1"));
//        sender.write(new TransCommand("CJ2", "!!!", "2222"));
//        sender.write(new TransCommand("CJ3", "!!!", "2222"));
//        int count = 0;
//        new Thread(() -> {
//            while (true) {
//                ICommand command = table.take();
//                System.out.println(command.getName() + " " + command.getDate());
//                try {
//                    Thread.sleep(400);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }).start();
//
//        for (; ; ) {
//            count++;
//            sender.write(new TransCommand(String.valueOf(count), String.valueOf(count + 10)));
//            Thread.sleep(2000);
//        }
//
//    }
//
//    @Test
//    public void ArrayTree() {
//        ArrayMerkleTree chain = new ArrayMerkleTree();
//        chain.addLast(new BlockNodeWrapper(new Stud_Info("CJA", "001")));
//        chain.addLast(new BlockNodeWrapper(new Stud_Info("CJB", "002")));
//        chain.addLast(new BlockNodeWrapper(new Stud_Info("CJC", "003")));
//        chain.addLast(new BlockNodeWrapper(new Stud_Info("CJD", "004")));
//        chain.addLast(new BlockNodeWrapper(new Stud_Info("CJE", "005")));
//        System.out.println(chain.getHash());
//        chain.updateNode(2,new Stud_Info("CJT","999"));
//        System.out.println(chain.getHash());
//    }
//
//
//    @Test
//    public void Table_Test() {
//        PCTable<ICommand> table = new PCTable<>(new ICommand[20]);
//        new Thread(() -> {
//            int i = 0;
//            while (true) {
//                table.put(new TransCommand("TEST A " + i));
//                i++;
//                try {
//                    Thread.sleep(700);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }).start();
//        new Thread(() -> {
//            int i = 0;
//            while (true) {
//                table.put(new TransCommand("TEST B " + i));
//                i++;
//                try {
//                    Thread.sleep(400);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }).start();
//        new Thread(() -> {
//            while (true) {
//                ICommand command = table.take();
//                System.out.println(command.getName() + " " + command.getDate());
//                try {
//                    Thread.sleep(400);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }).start();
//        while (true) {
//            ICommand command = table.take();
//            System.out.println(command.getName() + " " + command.getDate());
//            try {
//                Thread.sleep(400);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }

}
