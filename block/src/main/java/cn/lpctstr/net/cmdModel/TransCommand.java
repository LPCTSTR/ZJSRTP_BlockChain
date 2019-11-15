package cn.lpctstr.net.cmdModel;

import cn.hutool.core.date.DateUtil;
import cn.lpctstr.net.ObjTransPart.Model.ITransModel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @Author:LPCTSTR_MSR
 * @Description: The containers of network commands.The basic form of the transfer command.
 * @Date: 21:03 2019/7/14
 * @Project: netModule
 */
public class TransCommand extends ITransModel implements ICommand {
    private String cmd;

    private Date date;

    private List<String> _args;

    public String getCmd() {
        return cmd;
    }

    public void setCmd(String cmd) {
        this.cmd = cmd;
    }

    public List<String> getArgs() {
        return _args;
    }

    public TransCommand(String cmd, String ...args) {
        this.cmd = cmd;
        _args=new ArrayList<>();
        _args.addAll(Arrays.asList(args));
        date = DateUtil.date();
    }

    @Override
    public String getName() {
        return cmd;
    }

    @Override
    public String getDate() {
        return DateUtil.formatDateTime(date);
    }

}
