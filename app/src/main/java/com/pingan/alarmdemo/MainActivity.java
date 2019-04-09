package com.pingan.alarmdemo;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        System.out.println(22222);
        this.initData();
//        this.sendNotification(this);
//        this.writeFile();
    }

    private void initData() {
        AlarmManager manager = (AlarmManager) getSystemService(ALARM_SERVICE);//获取AlarmManager实例
        int anHour =  6 * 1000 ;  // 6秒
        long triggerAtTime = SystemClock.elapsedRealtime() + anHour;
        Intent intent2 = new Intent(this, AlarmReceiver.class);
        PendingIntent pi = PendingIntent.getBroadcast(this, 0, intent2, 0);
//        manager.set(AlarmManager.ELAPSED_REALTIME_WAKEUP, triggerAtTime, pi);//开启提醒
        manager.setRepeating(AlarmManager.ELAPSED_REALTIME_WAKEUP, triggerAtTime, 6000, pi);
    }

//    private void sendNotification(Context context) {
//        /**
//         *  创建通知栏管理工具
//         */
//
//        NotificationManager notificationManager = (NotificationManager) context.getSystemService
//                (NOTIFICATION_SERVICE);
//
//        /**
//         *  实例化通知栏构造器
//         */
//
//        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(this);
//
//        /**
//         *  设置Builder
//         */
//        //设置标题
//        mBuilder.setContentTitle("我是标题")
//                //设置内容
//                .setContentText("我是内容")
//                //设置大图标
//                .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher))
//                //设置小图标
//                .setSmallIcon(R.mipmap.ic_launcher_round)
//                //设置通知时间
//                .setWhen(System.currentTimeMillis())
//                //首次进入时显示效果
//                .setTicker("我是测试内容")
//                //设置通知方式，声音，震动，呼吸灯等效果，这里通知方式为声音
//                .setDefaults(Notification.DEFAULT_SOUND);
//        //发送通知请求
//        notificationManager.notify(10, mBuilder.build());
//    }

//    private void writeFile() {
//        try {
//            String path = Environment.getExternalStoragePublicDirectory("") + "/print.txt";
////            System.out.println(path);
//            File file = new File(path);
//            if (!file.exists() && file.createNewFile()) {
////                Toast.makeText(this, "创建文件成功", Toast.LENGTH_LONG).show();
//                System.out.println("Create file successed");
//            } else {
////                Toast.makeText(this, "创建文件失败", Toast.LENGTH_LONG).show();
//            }
//            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");// HH:mm:ss
////获取当前时间
//            Date date = new Date(System.currentTimeMillis());
//            String time = simpleDateFormat.format(date);
//            FileUtil.method2(path, time);
//            Toast.makeText(this, "写入文件成功", Toast.LENGTH_LONG).show();
//        } catch (Exception e) {
//            System.out.println(e);
//            Toast.makeText(this, "报错了", Toast.LENGTH_SHORT).show();
//        }
//    }

//    private void initData(){
//        Intent intent = new Intent(this,
//                AlarmActivity.class);
//        intent.setAction("111111");
//        // 创建PendingIntent对象
//        PendingIntent pi = PendingIntent.getActivity(
//                this, 0, intent, 0);
//        Calendar c = Calendar.getInstance();
//        // 根据用户选择时间来设置Calendar对象
//        System.out.println("hourOfDay = " + hourOfDay);
//        System.out.println("minute = " + minute);
//        c.set(Calendar.HOUR, hourOfDay);
//        c.set(Calendar.MINUTE, minute);
//        // 设置AlarmManager将在Calendar对应的时间启动指定组件
//        aManager.set(AlarmManager.RTC_WAKEUP,
//                c.getTimeInMillis(), pi);
//    }
}
