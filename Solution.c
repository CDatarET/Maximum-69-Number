int maximum69Number (int num) {
    char str[20];
    sprintf(str, "%d", num);
    for(int i = 0; i < 20; i++){
        if(str[i] == '6'){
            str[i] = '9';
            break;
        }
    }
    int ret = atoi(str);
    return(ret);
}
