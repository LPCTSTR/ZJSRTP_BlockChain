package cn.lpctstr.node.data;


import cn.lpctstr.node.data.model.Stud_Info;
import cn.lpctstr.node.data.wrapper.BlockNodeWrapper;

/**
 * @Author:LPCTSTR_MSR
 * @Description: Null
 * @Date: 13:05 2019/6/29
 * @Project: ZJSRTP
 */


public enum DataManager{
    INSTANCE;

    private BlockChain blockChain;
    private DataManager(){ blockChain = new BlockChain();}




    public static void digest(Object o){
        if(o instanceof Stud_Info)
            INSTANCE.blockChain.add(new BlockNodeWrapper((Stud_Info) o));
//        }else if(o instanceof BlockNodeWrapper)
//            INSTANCE.blockChain.add((BlockNodeWrapper) o);
    }


}







//public class DataManager {
//
//
//    private DataManager(){ list = new ArrayList<>();
//    }
////
////    private static DataManager dataManager;
////    public static DataManager getInstance(){
////        if(dataManager ==null){
////            synchronized (DataManager.class){
////                if(dataManager ==null)
////                    dataManager= new DataManager();
////            }
////        }
////
////        return dataManager;
////    }
//
//
//
//
//
//    private List<Stud_Info> list;
//}
