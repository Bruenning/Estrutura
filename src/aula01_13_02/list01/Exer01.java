package aula01_13_02.list01;

public class Exer01 {
    public boolean validateCPF(long cpf){

        String cpfCalc = String.valueOf(cpf).substring(0, 9);

        long somaDigitoUm = somaRecursiva(cpfCalc, 10);

        long resto = somaDigitoUm % 11;

        long digitoUm = 0;

        if(resto < 2){
            digitoUm = 0;
        }
        else{
            digitoUm = 11 - resto;
        }

        cpfCalc = cpfCalc + digitoUm;

        long somaDigitoDois = somaRecursiva(cpfCalc, 11);

        resto = somaDigitoDois % 11;

        long digitoDois = 0;

        if(resto < 2){
            digitoDois = 0;
        }
        else{
            digitoDois = 11 - resto;
        }

        cpfCalc = cpfCalc + digitoDois;

        return cpf == Long.parseLong(cpfCalc);

    }


    public long somaRecursiva(String valor, int multi){
        if(multi == 2){
            return Long.parseLong(valor) * multi;
        }
        else{
            return (Long.parseLong(valor.substring(0, 1)) * multi) + somaRecursiva(valor.substring(1,--multi), multi);
        }
    }
}
