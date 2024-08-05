/*
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * + Copyright 2024. NHN Academy Corp. All rights reserved.
 * + * While every precaution has been taken in the preparation of this resource,  assumes no
 * + responsibility for errors or omissions, or for damages resulting from the use of the information
 * + contained herein
 * + No part of this resource may be reproduced, stored in a retrieval system, or transmitted, in any
 * + form or by any means, electronic, mechanical, photocopying, recording, or otherwise, without the
 * + prior written permission.
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */

package com.nhnacademy;

import com.nhnacademy.thread.CounterHandler;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App
{
    public static void main( String[] args )
    {
        //TODO#1 counterHandlerA 객체를 생성 합니다. countMaxSize : 10
        CounterHandler counterHandlerA;
        //TODO#2 threadA 생성시 counterHandlerA 객체를 paramter로 전달 합니다.
        Thread threadA;
        //TODO#3 threadA의 name을 'my-counter-A' 로 설정 합니다.


        //TODO#4 counterHandlerB 객체를 생성 합니다. countMaxSize : 10
        CounterHandler counterHandlerB;
        //TODO#5 threadB 생성시 counterHandlerB 객체를 paramter로 전달 합니다.
        Thread threadB;
        //TODO#6 threadB의 name을 'my-counter-B' 로 설정 합니다.


        //TODO#7 threadA를 시작 합니다.


        //TODO#8 threadA 작업이 완료될 때까지 main Thread는 대기 합니다.


        //TODO#9 threadB를 시작 합니다.

        //TODO#10 threadB 작업이 완료될 때까지 main Thread는 대기 합니다.

        //TODO#11 'Application exit!' message를 출력 합니다.

    }
}