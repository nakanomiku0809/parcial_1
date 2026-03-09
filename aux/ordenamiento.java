int aux,dato[];
for(int i; i<dato[]; i++){
    for(int j; j<dato[]; j++){
        if(dato[i]<dato[i+1]){
            aux=dato[i];
            dato[i]=dato[i+1];
            dato[i+1]=aux;
        }
    }
}