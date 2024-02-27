package exception3;

class NegativeAmount extends Exception{
    private ErrorCode errorCode;

    public NegativeAmount(ErrorCode errorCode){
        super();
        this.errorCode = errorCode;
    }

    @Override
    public String toString() {
        return "Error Occured: "+ this.errorCode;
    }
}


enum ErrorCode{
    NEGATIVE_DEPOSITE(1002){
        @Override
        public String toString(){

            return "Negative amount not acceptped "+NEGATIVE_DEPOSITE.errorNumber;

        }
    },
    ZERO_DEPOSITE(1003){
        @Override
        public String toString(){
            return "zero amount not acceptped" + + ZERO_DEPOSITE.errorNumber;
        }

    };
    int errorNumber;
    ErrorCode(int errorNumber){
        this.errorNumber = errorNumber;
    }

}

