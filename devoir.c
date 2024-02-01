#include<stdio.h>
#include<stdlib.h>
#include<string.h>
typedef struct ListLiv *liste1;
typedef struct ListLiv{
char titre[20];
char auteur[16];
liste1 p;
}ListLiv;

typedef struct Biblio *liste2;
typedef struct Biblio{
char ctLiv[10];
int nbLiv;
liste1 hori;
liste2 verti;
}Biblio;

Biblio *initBiblio(){
Biblio *m=(Biblio *)malloc(sizeof(Biblio));
if(!m){
    printf("Erreur d'allocation initBiblio()");
    exit(-1);
}
else{
    strcpy(m->ctLiv,"");
    m->nbLiv=0;
    m->hori=NULL;
    m->verti=NULL;
}
return m;
}

Biblio * rechCat(liste2 L,char ctliv){
Biblio *t=L;
while(t != NULL){
    if(strcmp((t->ctLiv),ctliv)==0)
        return t;
    t=t->verti;
}
return NULL;
}

void ajoutCat(liste2 *L,char ctliv){
Biblio * nouv=(Biblio *)malloc(sizeof(Biblio));
strcpy(nouv->ctLiv,ctliv);
nouv->nbLiv=0;
nouv->verti=NULL;
nouv->hori=NULL;
if((*L)==NULL)
    (*L)=nouv;
else{
    liste2 prec;
    while(prec->verti != NULL)
        prec=prec->verti;
    prec->verti=nouv;
}
}

void ajoutLivre(liste2 *L,char ctliv,char tit,char aute){
ListLiv *nouv=(ListLiv *)malloc(sizeof(ListLiv));
liste2 t=*L;
if(nouv != NULL){
    if(rechCat(t,ctliv)!=NULL){
        t->nbLiv++;
        strcpy(nouv->titre,tit);
        strcpy(nouv->auteur,aute);
        nouv->p=t->hori;
        t->hori=nouv;
    }
    else
        printf("le categorie n'exest pas");
}
}

void supprimCat(liste2 *L,char ctliv){
liste2 H;
liste2 h;
while((*L)!= NULL && strcmp((*L)->ctLiv,ctliv)!=0){
    H=*L;
    (*L)=(*L)->verti;
}
if((*L) == NULL)
    printf("la categorie %s n'exest pas dans le biblio",ctliv);
else{
    if((*L)->verti == NULL){
            H->verti=NULL;
        while((*L)->hori != NULL){
            h=(*L)->hori;
            (*L)=(*L)->hori->p;
            free(h);
        }
        free(*L);
        (*L)=NULL;
        (*L)=H;
    }
    else{
        liste2 d=(*L);
        liste2 w;
        H->verti=(*L)->verti;
        *L=H;
        while(d->hori != NULL){
            w=d->hori;
            d=d->hori->p;
            free(w);
        }
        free(d);
    }
}
}

void afficheLivre(liste2 g,char ctliv){
while(g!=NULL && strcmp(g->ctLiv,ctliv) != 0){
    g=g->verti;
}
if(g==NULL)
    printf("cette categorie n'exeste pas");
else{
    while(g->hori !=NULL){
        printf("%s",g->hori->titre);
        g->hori=g->hori->p;
    }
}
}

int totalLivres(liste2 x){
int i=0;
while(x!=NULL){
    i+=x->nbLiv;
    x=x->verti;
}
return i;
}
int main(){
return 0;
}
