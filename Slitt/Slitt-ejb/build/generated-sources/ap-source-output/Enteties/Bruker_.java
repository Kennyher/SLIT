package Enteties;

import Enteties.Fremgang;
import Enteties.Innlevering;
import Enteties.Kalender;
import Enteties.Tilbakemelding;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-30T11:27:18")
@StaticMetamodel(Bruker.class)
public class Bruker_ { 

    public static volatile ListAttribute<Bruker, Kalender> Kalender;
    public static volatile SingularAttribute<Bruker, Long> BrukerId;
    public static volatile SingularAttribute<Bruker, Integer> TlfNr;
    public static volatile ListAttribute<Bruker, Innlevering> Innlevering;
    public static volatile SingularAttribute<Bruker, String> Email;
    public static volatile ListAttribute<Bruker, Fremgang> Fremgang;
    public static volatile SingularAttribute<Bruker, String> FirstName;
    public static volatile ListAttribute<Bruker, Tilbakemelding> Tilbakemelding;
    public static volatile SingularAttribute<Bruker, String> LastName;

}