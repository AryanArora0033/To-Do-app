package com.example.todo



object DataObject {
    var listdata= mutableListOf<cardinfo>()
    fun setdata(title:String,priority:String) {
        listdata.add(cardinfo(title,priority))
    }
    fun getdata():List<cardinfo>{
        return listdata


    }
    fun deletedata(){
        listdata.clear()
    }
    fun getsingledata(pos:Int):cardinfo{
        return listdata[pos]
    }
    fun deletesingledata(pos: Int){
        listdata.removeAt(pos)
    }
    fun updatedata(pos:Int,title:String,priority:String){
        listdata[pos].title=title
        listdata[pos].priority=priority
    }
}