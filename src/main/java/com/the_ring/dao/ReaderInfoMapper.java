package com.the_ring.dao;

import com.the_ring.domain.ReaderInfo;

import java.util.ArrayList;


public interface ReaderInfoMapper {


    ArrayList<ReaderInfo> getAllReaderInfo();

    ReaderInfo findReaderInfoByReaderId(int readerId);

    int deleteReaderInfo(int readerId);

    int editReaderInfo(ReaderInfo readerInfo);

    int addReaderInfo(ReaderInfo readerInfo);

}
