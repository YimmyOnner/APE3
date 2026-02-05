#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <locale.h>
#include <windows.h>

struct Estudiantes
{
    char nombre[100];
    int edad;
    char carrera[100];
};

int main(){
    SetConsoleOutputCP(CP_UTF8);   // consola en UTF-8
    setlocale(LC_ALL, "es_ES.UTF-8");
    FILE * archivo;
    FILE * nomb;
    int numero, i;
    int MAX_EST=3;
    char linea[100];
    int contador=0;
    char *token;

    struct Estudiantes estudiantes[MAX_EST];
   
    archivo= fopen("datosInformacion.csv", "r");
    //Leer la Cabecera
    fgets(linea, 2000, archivo);
    //Leer Información

    while(fgets(linea, 2000, archivo) != NULL && contador < MAX_EST){
        
        token= strtok(linea, ",");
        strcpy(estudiantes[contador].nombre, token);

        token = strtok(NULL, ",");
        estudiantes[contador].edad = atoi(token);

        token = strtok(NULL, ",");
        token[strcspn(token, "\n")]= '\0';
        strcpy(estudiantes[contador].carrera, token);
        contador++;
    }

    nomb = fopen("archivo.csv", "w");

     if (nomb == NULL) {
        printf("Error al crear el archivo\n");
        
    }

    fprintf(nomb,"\n======================================"); 
    for(i=0; i< MAX_EST; i++){
    fprintf(nomb,"\nEl Estudiante %i es: %s", i + 1,estudiantes[i].nombre);
    fprintf(nomb,"\nLa edád del Estudiante %i es: %i", i + 1,estudiantes[i].edad);
    fprintf(nomb,"\nLa carrera del Estudiante %i es %s",i + 1, estudiantes[i].carrera);
    fprintf(nomb,"\n======================================");
    }
    
    fclose(archivo);
    fclose(nomb);

    for(i=0; i < contador; i++){
    printf("\nLa edád del estudiante es: %i\n",estudiantes[i].edad );
    }
    return 0;
}
