package bridgeConnection;

class BMPImage extends Image{
    public void parseFile(String fileName){
        //模拟解析BMP文件并获得一个像素矩阵对象m;
        Matrix m = new Matrix();
        imp.doPaint(m);
        System.out.println(fileName + ",格式为BMP");
    }
}
