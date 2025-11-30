package org.example.elhansen.config;


import org.example.elhansen.model.*;
import org.example.elhansen.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InitData implements CommandLineRunner {

    @Autowired
    YdelseRepository ydelseRepository;

    @Autowired
    KontaktInfoRepository kontaktInfoRepository;

    @Autowired
    ForsideInfoRepository forsideInfoRepository;

    @Autowired
    OmInfoRepository omInfoRepository;

    @Autowired
    TidligereOpgaveRepository tidligereOpgaveRepository;

    @Autowired
    SagRepository sagRepository;

    @Override
    public void run(String... args) throws Exception {

// 1. OPRET YDELSER (Kun hvis databasen er tom)
        if (ydelseRepository.count() == 0) {
            System.out.println("Databasen er tom. Opretter 12 standard ydelser...");

            // 1. Stikkontakter
            Ydelse stik = new Ydelse("Udskiftning af stikkontakt", "Vi udskifter dine gamle, løse eller malede kontakter til nye sikre modeller.", "power");
            stik.getLinjer().add(new YdelseLinje("Ny stikkontakt (LK Fuga)", 150.0));
            stik.getLinjer().add(new YdelseLinje("Udskiftning (Arbejdsløn)", 600.0));
            stik.getLinjer().add(new YdelseLinje("Kørsel", 200.0));
            ydelseRepository.save(stik);

            // 2. Lamper
            Ydelse lampe = new Ydelse("Ophængning af lamper", "Professionel montering af lamper i loft eller på væg, så de hænger snorlige.", "lightbulb");
            lampe.getLinjer().add(new YdelseLinje("Montering af lampe (pr. stk)", 450.0));
            lampe.getLinjer().add(new YdelseLinje("Opsætning af lampested", 650.0));
            lampe.getLinjer().add(new YdelseLinje("Timepris (ved specielle lamper)", 850.0));
            ydelseRepository.save(lampe);

            // 3. HPFI & Tavle
            Ydelse hpfi = new Ydelse("Nyt HPFI-Relæ & Tavle", "Udskiftning af eltavle eller relæ for din og familiens sikkerhed.", "gpp_good");
            hpfi.getLinjer().add(new YdelseLinje("HPFI Relæ enhed", 1200.0));
            hpfi.getLinjer().add(new YdelseLinje("Montering og lovpligtig test", 1500.0));
            hpfi.getLinjer().add(new YdelseLinje("Ny gruppeafbryder", 350.0));
            ydelseRepository.save(hpfi);

            // 4. El-tjek (Bolighandel)
            Ydelse tjek = new Ydelse("El-tjek & Statusrapport", "Lovpligtigt eftersyn ved salg af andel eller ejerbolig. Få vished om installationerne.", "description");
            tjek.getLinjer().add(new YdelseLinje("Gennemgang af lejlighed", 2500.0));
            tjek.getLinjer().add(new YdelseLinje("Gennemgang af villa/hus", 3500.0));
            tjek.getLinjer().add(new YdelseLinje("Udarbejdelse af rapport", 500.0));
            ydelseRepository.save(tjek);

            // 5. El-bil Lader
            Ydelse elbil = new Ydelse("Ladestander til El-bil", "Få din egen tankstation hjemme. Vi installerer ladebokse fra alle kendte mærker.", "ev_station");
            elbil.getLinjer().add(new YdelseLinje("Standard installation (op til 10m)", 4500.0));
            elbil.getLinjer().add(new YdelseLinje("Ekstra kabeltræk (pr. meter)", 150.0));
            elbil.getLinjer().add(new YdelseLinje("Opsætning af ladeboks", 1500.0));
            ydelseRepository.save(elbil);

            // 6. Fejlsøgning
            Ydelse fejl = new Ydelse("Fejlsøgning & Akut hjælp", "Er strømmen gået, eller slår relæet fra? Vi finder fejlen hurtigt og effektivt.", "search");
            fejl.getLinjer().add(new YdelseLinje("Første time (inkl. kørsel)", 1250.0));
            fejl.getLinjer().add(new YdelseLinje("Efterfølgende timer", 850.0));
            fejl.getLinjer().add(new YdelseLinje("Måleudstyr leje", 250.0));
            ydelseRepository.save(fejl);

            // 7. Køkken & Bad
            Ydelse renovation = new Ydelse("Køkken & Badeværelse", "Renovering af strøm i vådrum og køkken. Vi flytter kontakter og trækker nye kabler.", "home_repair_service");
            renovation.getLinjer().add(new YdelseLinje("Tilslutning af emhætte/komfur", 850.0));
            renovation.getLinjer().add(new YdelseLinje("Installation af spots (pr. stk)", 650.0));
            renovation.getLinjer().add(new YdelseLinje("Fræsning af riller (pr. time)", 950.0));
            ydelseRepository.save(renovation);

            // 8. Hvidevarer
            Ydelse hvide = new Ydelse("Tilslutning af Hvidevarer", "Sikker tilslutning af vaskemaskine, tørretumbler, opvaskemaskine eller ovn.", "electrical_services");
            hvide.getLinjer().add(new YdelseLinje("Tilslutning pr. maskine", 750.0));
            hvide.getLinjer().add(new YdelseLinje("Montering af lovpligtig afbryder", 350.0));
            hvide.getLinjer().add(new YdelseLinje("Bortskaffelse af gammel maskine", 400.0));
            ydelseRepository.save(hvide);

            // 9. Netværk & Data
            Ydelse data = new Ydelse("Netværk & Wi-Fi", "Stabilt internet i hele huset. Vi trækker datakabler og opsætter access points.", "router");
            data.getLinjer().add(new YdelseLinje("Dataudtag (RJ45) montering", 450.0));
            data.getLinjer().add(new YdelseLinje("Kabeltræk (pr. meter)", 75.0));
            data.getLinjer().add(new YdelseLinje("Opsætning af router/AP", 850.0));
            ydelseRepository.save(data);

            // 10. Dørtelefon
            Ydelse door = new Ydelse("Dørtelefon & Adgang", "Driller dørtelefonen i opgangen? Vi servicerer og udskifter gamle anlæg.", "doorbell");
            door.getLinjer().add(new YdelseLinje("Udskiftning af hustelefon (i lejlighed)", 1100.0));
            door.getLinjer().add(new YdelseLinje("Fejlsøgning på anlæg (timepris)", 850.0));
            ydelseRepository.save(door);

            // 11. Udendørs Belysning
            Ydelse ude = new Ydelse("Udendørs Belysning", "Få lys i indkørslen eller haven. Vi monterer lamper med sensor eller tidsstyring.", "landscape");
            ude.getLinjer().add(new YdelseLinje("Montering af sensor", 950.0));
            ude.getLinjer().add(new YdelseLinje("Bed-lampe montering", 600.0));
            ude.getLinjer().add(new YdelseLinje("Nedgravning af kabel (pr. time)", 850.0));
            ydelseRepository.save(ude);

            // 12. Smart Home
            Ydelse smart = new Ydelse("Smart Home & Styring", "Styr lyset fra telefonen. Vi installerer Philips Hue, IHC eller Shelly relæer.", "smartphone");
            smart.getLinjer().add(new YdelseLinje("Montering af lysdæmper", 650.0));
            smart.getLinjer().add(new YdelseLinje("Opsætning af Smart-relæ (Shelly)", 550.0));
            smart.getLinjer().add(new YdelseLinje("Programmering (timepris)", 950.0));
            ydelseRepository.save(smart);
        }
        // 2. OPRET KONTAKT INFO (Overskriver altid ID 1, så vi er sikre på data er der)
        KontaktInfo kontakt = new KontaktInfo(
                "Guldbergsgade 29N\n2200 København N",
                "+ 45 36 15 45 00",
                "Man - Tors: 07:00 - 16:00\nFredag: 07:00 - 14:00"
        );
        kontakt.setId(1); // VIGTIGT: Tving ID 1
        kontaktInfoRepository.save(kontakt);

        // 3. OPRET FORSIDE INFO
        ForsideInfo forside = new ForsideInfo(
                "Professionelt El-arbejde",
                "Vi sikrer lys i lampen og strøm i kontakten hos Holger Hansen.",
                "https://images.unsplash.com/photo-1621905251189-08b45d6a269e?q=80&w=2069&auto=format&fit=crop", // Et flot elektriker billede
                "Velkommen til EL-Hansen",
                "EL-Hansen er din lokale elektriker på Nørrebro. Jeg sætter en ære i at levere håndværk af højeste kvalitet, hvor aftaler overholdes og løsningen holder. Uanset om du skal have skiftet en stikkontakt eller renoveret hele lejligheden, står jeg klar til at hjælpe."
        );
        forside.setId(1);
        forsideInfoRepository.save(forside);

        // 4. OPRET OM OS INFO
        OmInfo om = new OmInfo(
                "Ung energi og faglig stolthed",
                "EL-hansen er ejet og drevet af Holger Kongstad Jensen. Jeg er uddannet elektriker og stiftede firmaet som 19-årig med en drøm om at skabe en moderne el-installatørforretning.",
                "At være en ung håndværker ser jeg som min største styrke. Jeg er uddannet i de nyeste teknologier og installationstyper, og jeg går til enhver opgave med nysgerrighed.",
                "Din garanti for en god oplevelse",
                "Som selvstændig mester ved jeg, at min forretning kun er så god som min sidste opgave. Derfor går jeg ikke på kompromis.",
                "Har du brug for en elektriker, der tager dit projekt seriøst – uanset om det er stort eller småt? Så kontakt mig i dag.",
                "https://images.unsplash.com/photo-1504328345606-18bbc8c9d7d1?q=80&w=2070&auto=format&fit=crop" // Et portræt billede
        );
        om.setId(1);
        omInfoRepository.save(om);

        System.out.println("✅ Standard data er indlæst i databasen!");

        // 5. OPRET TIDLIGERE OPGAVER (Portfolio)
        if (tidligereOpgaveRepository.count() == 0) {
            tidligereOpgaveRepository.save(new TidligereOpgave(
                    "Renovering af herskabslejlighed",
                    "Komplet udskiftning af el-installationer samt etablering af spots i stuklofter på Frederiksberg.",
                    "https://images.unsplash.com/photo-1600607686527-6fb886090705?q=80&w=2000&auto=format&fit=crop"
            ));
            tidligereOpgaveRepository.save(new TidligereOpgave(
                    "Ny eltavle i rækkehus",
                    "Udskiftning af gammel stoflednings-installation til ny sikker eltavle med automatsikringer.",
                    "https://images.unsplash.com/photo-1556911220-e15b29be8c8f?q=80&w=2000&auto=format&fit=crop"
            ));
            tidligereOpgaveRepository.save(new TidligereOpgave(
                    "Belysning i kontorlandskab",
                    "Montering af akustik-venlig LED belysning for større virksomhed i København K.",
                    "https://images.unsplash.com/photo-1497366216548-37526070297c?q=80&w=2000&auto=format&fit=crop"
            ));
        }

        // 6. OPRET SAGER TIL SAGSSTYRING (Kanban)
        if (sagRepository.count() == 0) {
            System.out.println("Opretter test-sager til Kanban boardet...");

            // --- Kategori: NYE HENVENDELSER (Status: NY) ---
            Sag s1 = new Sag(
                    "Strøm gået i køkkenet",
                    "Hej Holger. Pludselig gik strømmen i hele køkkenet, og relæet slår fra, når jeg prøver at tænde det igen. Kan du komme forbi hurtigst muligt?",
                    "Morten Mortensen",
                    "morten@mail.dk",
                    "20304050",
                    "Nørrebrogade 12, 3.th"
            );
            s1.setStatus("NY"); // Standard status
            sagRepository.save(s1);

            Sag s2 = new Sag(
                    "Tilbud på ladeboks",
                    "Vi har lige købt en Tesla og vil gerne have et tilbud på opsætning af en ladeboks i indkørslen. Vi har ca. 10 meter fra tavlen.",
                    "Sofie Sommer",
                    "sofie@outlook.dk",
                    "12345678",
                    "Villavej 5, Valby"
            );
            s2.setStatus("NY");
            sagRepository.save(s2);


            // --- Kategori: TILBUD SENDT (Status: TILBUD) ---
            Sag s3 = new Sag(
                    "Renovering af 1. sal",
                    "Som aftalt vil jeg gerne se et tilbud på komplet udskiftning af kontakter og trækning af nye kabler på 1. salen.",
                    "Anders Andersen",
                    "anders@firma.dk",
                    "87654321",
                    "Hovedgaden 88"
            );
            s3.setStatus("TILBUD"); // Vi ændrer status manuelt
            sagRepository.save(s3);

            Sag s4 = new Sag(
                    "Udendørs belysning",
                    "Tilbud på opsætning af 4 spots i udhænget samt sensor ved indkørslen.",
                    "Camilla Carlsen",
                    "camilla@gmail.com",
                    "11223344",
                    "Skovvej 4"
            );
            s4.setStatus("TILBUD");
            sagRepository.save(s4);


            // --- Kategori: I GANG / PLANLAGT (Status: IGANG) ---
            Sag s5 = new Sag(
                    "Nyt HPFI-relæ",
                    "Aftalt montering tirsdag kl. 08:00. Kunden har selv ryddet plads foran tavlen.",
                    "Jens Jensen",
                    "jens@mail.dk",
                    "99887766",
                    "Guldbergsgade 29N"
            );
            s5.setStatus("IGANG");
            sagRepository.save(s5);

            Sag s6 = new Sag(
                    "Kabling af kontor",
                    "Trækning af PDS kabler til 10 arbejdsstationer. Nøgleboks koden er 1234.",
                    "Tech Solutions ApS",
                    "info@techsolutions.dk",
                    "33445566",
                    "Industrivej 10"
            );
            s6.setStatus("IGANG");
            sagRepository.save(s6);


            // --- Kategori: AFSLUTTET (Status: AFSLUTTET) ---
            Sag s7 = new Sag(
                    "Udskiftning af stikkontakt",
                    "Opkrævning sendt. Kunden var tilfreds.",
                    "Grethe Hansen",
                    "grethe@mail.dk",
                    "22334455",
                    "Solvænget 2"
            );
            s7.setStatus("AFSLUTTET");
            sagRepository.save(s7);

            Sag s8 = new Sag(
                    "Fejlsøgning vaskemaskine",
                    "Det var bare en løs forbindelse. Lavet på 30 min.",
                    "Peter Pedersen",
                    "peter@hotmail.com",
                    "88990011",
                    "Vesterbrogade 100"
            );
            s8.setStatus("AFSLUTTET");
            sagRepository.save(s8);
        }
    }
}
